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

/**
 *
 * @author deepak
 */

/*
 * Zoom.java
 *
 * this class provides a static method getZoomedValue which return the zoomed value based on the percentage
 */
public class Zoom {

    public static int getZoomedValue(int value, int percentage) {
        // if positive percentage then add the percentage value to the original value
        if (percentage >= 0) {
            return (int) (value + ((float) value * percentage / 100));
        }
        // else subtract the percentage value from the original value
        else {
            return (int) (value - ((float) (-value) * percentage / 100));
        }
    }
}
