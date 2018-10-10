/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingfreecourse;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Yframe_lesson extends JFrame {
    
    private Ypanel_lesson ypnl;
    private JScrollPane sp;

    public Yframe_lesson(String title, int w, int h)  {
        super(title);
        this.setSize(w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ypnl =new Ypanel_lesson();
        sp = new JScrollPane(ypnl);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(sp);
    }
    
    public void yShow(){
    this.setVisible(true);
    }


    
    

}
