/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingsavefile;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class YpanelSave extends JPanel{
    
private JButton btn;
private JTextArea tA;

    public YpanelSave() {
        btn = new JButton("save");
        btn.addActionListener((ae) -> {
            YAction.saveFile(btn, tA.getText());
            
        });
        add(btn);
        
        tA = new JTextArea(11, 40);
        add(new JScrollPane(tA));
    }


}

