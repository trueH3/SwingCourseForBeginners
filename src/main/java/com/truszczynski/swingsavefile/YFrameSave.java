/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingsavefile;

import javax.swing.JFrame;

public class YFrameSave extends JFrame {
    
   private YpanelSave yPanelSave;

    public YFrameSave(String title, int w, int h)  {
        super(title);
        this.setSize(w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        yPanelSave =new YpanelSave();
        this.add(yPanelSave);
        this.setVisible(true);
    }
}