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

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author deepak
 */

/*
 * Tile.java
 * 
 * tile class which implements the tile object
 */
public class Tile {
    // tile width

    private int width;
    // tile height
    private int height;
    // tile border color to be used in the image viewer panel
    private Color borderColor;
    // location coordinate x of tile on the image viewer panel
    private int x;
    // location coordinate y of tile on the image viewer panel
    private int y;
    // tile image
    private BufferedImage tileImage;

    public Tile() {
    }

    /*
     * getBorderColor method to get the border color of the tile
     */
    public Color getBorderColor() {
        return borderColor;
    }

    /*
     * setBorderColor method to set the border color of the tile
     */
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    /*
     * getHeight method to get the height of the tile
     */
    public int getHeight() {
        return height;
    }

    /*
     * setHeight method to set the height of the tile
     */
    public void setHeight(int height) {
        this.height = height;
        // firing the property change
        // in-order to be listened by the property change listner components
        this.propertyChangeSupport.firePropertyChange(tileProperty, 0, 1);
    }

    /*
     * getTileImage method to get the tile image
     */
    public BufferedImage getTileImage() {
        return tileImage;
    }

    /*
     * setTileImage method to set the tile image
     */
    public void setTileImage(BufferedImage tileImage) {
        this.tileImage = tileImage;
    }

    /*
     * getWidth method to get the width of the tile
     */
    public int getWidth() {
        return width;
    }

    /*
     * setWidth method to set the width of the tile
     */
    public void setWidth(int width) {
        this.width = width;
        // firing the property change
        // in-order to be listened by the property change listner components
        this.propertyChangeSupport.firePropertyChange(tileProperty, 0, 1);
    }

    /*
     * getX method to get the x coordinate of the tile on the image viewer panel
     */
    public int getX() {
        return x;
    }

    /*
     * setX method to set the x coordinate of the tile on the image viewer panel
     */
    public void setX(int x) {
        this.x = x;
        // firing the property change
        // in-order to be listened by the property change listner components
        this.propertyChangeSupport.firePropertyChange(tileProperty, 0, 1);
    }

    /*
     * getY method to get the y coordinate of the tile on the image viewer panel
     */
    public int getY() {
        return y;
    }

    /*
     * setY method to set the y coordinate of the tile on the image viewer panel
     */
    public void setY(int y) {
        this.y = y;
        // firing the property change
        // in-order to be listened by the property change listner components
        this.propertyChangeSupport.firePropertyChange(tileProperty, 0, 1);
    }
    //-------------- TILE PROPERTY IMPLEMENTATION <IDE GENERATOR> --------------
    protected String tileProperty = "TILE_IMAGE_CHANGED";

    /**
     * Get the value of tileProperty
     *
     * @return the value of tileProperty
     */
    public String getTileProperty() {
        return tileProperty;
    }

    /**
     * Set the value of tileProperty
     *
     * @param tileProperty new value of tileProperty
     */
    public void setTileProperty(String tileProperty) {
        this.tileProperty = tileProperty;
    }
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
