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

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author deepak
 */
/*
 * this class is a file filter which filters out image files
 */
public class ImageFileFilter extends FileFilter {
    
    /*
     *  overriden accept method
     */
    @Override
    public boolean accept(File f) {
        // get the file name in lower case
        String fileName = f.getName().toLowerCase();
        // accept if it is a directory or an image file
        return f.isDirectory() || fileName.endsWith(".jpg")
                || fileName.endsWith(".jpeg")
                || fileName.endsWith(".png")
                || fileName.endsWith(".gif")
                || fileName.endsWith(".bmp");
    }

    /*
     * overriden getDescription method
     */
    @Override
    public String getDescription() {
        // file type string to be shown in the file type selection window
        return "Image Files";
    }
}
