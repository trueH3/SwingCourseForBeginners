package com.truszczynski.notepadClone;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class YpanelNotepadGridbag extends JPanel {

    private YframeNotepad frame;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem openFile, saveFile, close;

    private JTextArea textArea;
    private JScrollPane scrollPane;

    private GridBagConstraints gc;

    public YpanelNotepadGridbag(YframeNotepad frame) {
        this.frame = frame;

        setLayout(new GridBagLayout());
        gc = new GridBagConstraints();
        createMenu();
        createWorkArea();
    }

    public void createMenu() {
        menuBar = new JMenuBar();
        menu = new JMenu("file");
        openFile = new JMenuItem("open");
        saveFile = new JMenuItem("save");
        close = new JMenuItem("close");

        openFile.addActionListener((ae) -> {
            NotepadActions.addOpenAction(textArea, this);
        });

        saveFile.addActionListener((ae) -> {
            NotepadActions.addSaveAction(textArea, this);
        });

        close.addActionListener((ae) -> {
            // non-zero parameter indicates abnormal shutdown
            // alternatively i could pass frame parameter into this panel and use
            // method jFrame.dispose();
            //System.exit(0);
            frame.dispose();
        });

        menuBar.add(menu);

        menu.add(openFile);
        menu.add(saveFile);
        menu.add(close);
        frame.setJMenuBar(menuBar);

    }

    private void createWorkArea() {

        //first parameter - rows , second columns
        // but if i put tA to scroll pane, size of pane matters
        textArea = new JTextArea();
        textArea.setFont(new Font("Century Gothic", Font.BOLD, 12));
        scrollPane = new JScrollPane(textArea);
        gc.gridx = 0;
        gc.gridy = 0;
        
        //weight is important in resizing "if the space within a panel is grater
        //than the prefferedDImension of the components contained within 
        // the weightx and y is used to distribute the extra space to the individual 
        // components , use values from 0.0 to 1.0 (like a percentage)"
        // so when i use 1 then my pane will take all remaining space during
        // resizing
        gc.weightx = 1;
        gc.weighty = 1;
        
        // gc.BOTH means that it resizes component bot vertically and horizontally
        
        gc.fill = GridBagConstraints.BOTH;
        //scrollPane.setBounds(20, 45, 610, 275);
        add(scrollPane, gc);

    }
}
