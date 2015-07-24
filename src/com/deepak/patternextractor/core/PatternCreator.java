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

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author deepak
 */

/*
 *  PatternCreator.java
 *
 * defines static method to create an pattern image
 * based on the tile image and the specified resolution
 */
public class PatternCreator {

    /*
     * createPattern method to create a pattern based on the tile and the resolution
     */
    public static BufferedImage createPattern(Tile tile, int patternWidth, int patternHeight) {
        // if the tile is null then return a null image
        if (tile == null) {
            return null;
        } else {
            // create a image based on the resolution
            BufferedImage pattern = new BufferedImage(patternWidth, patternHeight, BufferedImage.TYPE_INT_ARGB);
            // get the graphics object of that image
            Graphics patternGraphics = pattern.getGraphics();
            // draw the pattern onto the image using the tile image
            for (int j = 0; j <= patternHeight; j += tile.getHeight()) {
                for (int i = 0; i <= patternWidth; i += tile.getWidth()) {
                    patternGraphics.drawImage(tile.getTileImage(), i, j, null);
                }
            }
            // return the pattern image
            return pattern;
        }
    }
}
