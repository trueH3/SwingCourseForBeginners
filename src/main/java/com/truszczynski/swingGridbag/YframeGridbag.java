/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingGridbag;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class YframeGridbag extends JFrame{
    private YpanelGridbag panel;

    public YframeGridbag(String title, int width, int height) throws HeadlessException {
        super(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new YpanelGridbag();
        this.add(panel);
        this.setVisible(true);

    }
}
