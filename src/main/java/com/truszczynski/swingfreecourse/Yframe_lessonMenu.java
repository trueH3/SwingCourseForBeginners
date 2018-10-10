/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingfreecourse;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Yframe_lessonMenu extends JFrame {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem openFile, saveFile, closeFile;
    private Ypanel_lessonTable panelWithTable;

    public Yframe_lessonMenu(String title, int w, int h) {
        super(title);
        this.setSize(w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        panelWithTable = new Ypanel_lessonTable();
        JScrollPane scrollPane = new JScrollPane(panelWithTable);
        this.add(scrollPane);
        createMenu();

    }

    private void createMenu() {

        menuBar = new JMenuBar();
        menu = new JMenu("file");
        openFile = new JMenuItem("open");
        saveFile = new JMenuItem("save");
        closeFile = new JMenuItem("exit");

        menuBar.add(menu);
        menu.add(openFile);
        menu.add(saveFile);
        menu.add(closeFile);

        setJMenuBar(menuBar);
    }



}
