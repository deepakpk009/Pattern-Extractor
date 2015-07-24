/*
This file is part of PatternExtractor v0.3

PatternExtractor is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

PatternExtractor is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with PatternExtractor.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.deepak.patternextractor.core;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author deepak
 */

/*
 * ImageResize.java
 *
 * this class defines a static method to resize an image
 * based on the zoom percentage
 */
public class ImageResize {

    /*
     * resize method to resize the source image based on zoom percentage
     */
    public static BufferedImage resize(BufferedImage sourceImage, int zoomPercentage) {
        //get the zoomed image width
        int newImageWidth = Zoom.getZoomedValue(sourceImage.getWidth(), zoomPercentage);
        //get the zoomed image height
        int newImageHeight = Zoom.getZoomedValue(sourceImage.getHeight(), zoomPercentage);
        // create an image with the zoomed resolution
        BufferedImage zoomImage = new BufferedImage(newImageWidth, newImageHeight, BufferedImage.TYPE_INT_ARGB);
        // create a 2d graphics object for that image
        Graphics2D g = zoomImage.createGraphics();
        // draw the source image onto the new image
        g.drawImage(sourceImage, 0, 0, newImageWidth, newImageHeight, null);
        // release the resources held by the graphics object
        g.dispose();
        // return the zoomed image
        return zoomImage;
    }
}
