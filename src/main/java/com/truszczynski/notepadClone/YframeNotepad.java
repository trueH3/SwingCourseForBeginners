package com.truszczynski.notepadClone;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class YframeNotepad extends JFrame {

    private YpanelNotepadAbsolute absolutePanel;
    private YpanelNotepadGridbag gridbagPanel;

    public YframeNotepad(String title, int w, int h) throws HeadlessException {
        super(title);
        this.setSize(w, h);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        absolutePanel = new YpanelNotepadAbsolute(this);
//        add(absolutePanel);
        gridbagPanel = new YpanelNotepadGridbag(this);
        add(gridbagPanel);
        this.setVisible(true);

    }

}
