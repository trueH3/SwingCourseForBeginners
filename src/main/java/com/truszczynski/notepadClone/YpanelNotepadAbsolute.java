package com.truszczynski.notepadClone;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class YpanelNotepadAbsolute extends JPanel {
    
    private YframeNotepad notepadFrame;
    
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem openFile, saveFile, close;
    
    private JTextArea textArea;
    private JScrollPane scrollPane;
    
    public YpanelNotepadAbsolute(YframeNotepad notepadFrame) {
        this.notepadFrame = notepadFrame;
        
        setPreferredSize(new Dimension(667, 364));
        //because of absolute positioning I set layout to null
        setLayout(null);
        
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
            System.exit(0);
        });
        
        menuBar.add(menu);
        
        menu.add(openFile);
        menu.add(saveFile);
        menu.add(close);
        menuBar.setBounds(0, 0, 670, 25);
        add(menuBar);
        //notepadFrame.setJMenuBar(menuBar);
        
    }
    
    private void createWorkArea() {

        //first parameter - rows , second columns
        // but if i put tA to scroll pane, size of pane matters
        textArea = new JTextArea();
        textArea.setFont(new Font("Century Gothic", Font.BOLD, 12));
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(20, 45, 610, 275);
        add(scrollPane);
        
    }
}
