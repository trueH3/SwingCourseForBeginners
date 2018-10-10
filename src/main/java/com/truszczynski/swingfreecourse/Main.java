/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingfreecourse;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Yframe_lesson yFrame = new Yframe_lesson("someTitle", 500, 600);
        yFrame.yShow();

        Yframe_lessonMenu lessonMenu = new Yframe_lessonMenu("new window", 500, 400);


    }
}
