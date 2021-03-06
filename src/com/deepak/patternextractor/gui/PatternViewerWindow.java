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

/*
 * PatternViewerWindow.java
 *
 * Created on Jun 29, 2012, 12:02:04 AM
 */
package com.deepak.patternextractor.gui;

import com.deepak.patternextractor.core.Tile;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author deepak
 */

/*
 * PatternViewerWindow.java
 *
 * this class provides the frame for the pattern viewer panel
 */
public class PatternViewerWindow extends javax.swing.JFrame {

    // tile refference
    private Tile tile;

    /**
     * Creates new form NewJFrame
     */
    public PatternViewerWindow() {
        initComponents();
        // set the title bar icon
        try {
            this.setIconImage(ImageIO.read(getClass().getResource("/com/deepak/patternextractor/gui/resources/pattern_extractor_icon_16x16.png")));
        } catch (IOException ex) {
            Logger.getLogger(PatternViewerWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     * setter mathod to set the tile reffernce
     */
    public void setTile(Tile tile) {
        // set the pattern panel tile reference
        patternPanel.setTile(tile);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patternPanel = new com.deepak.patternextractor.gui.PatternPanel();

        setTitle("Pattern Viewer");

        javax.swing.GroupLayout patternPanelLayout = new javax.swing.GroupLayout(patternPanel);
        patternPanel.setLayout(patternPanelLayout);
        patternPanelLayout.setHorizontalGroup(
            patternPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        patternPanelLayout.setVerticalGroup(
            patternPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patternPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patternPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.deepak.patternextractor.gui.PatternPanel patternPanel;
    // End of variables declaration//GEN-END:variables
}
