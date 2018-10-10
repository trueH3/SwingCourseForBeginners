package com.truszczynski.notepadClone;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotepadActions {

    private static final Logger LOGGER = LoggerFactory.getLogger(NotepadActions.class);

    public static void addOpenAction(JTextArea textArea, Component component) {
        textArea.setText("");
        JFileChooser openChooser = new JFileChooser();
        BufferedReader reader = null;
        //parameter in .showSaveDialog is a parent component around which file chooser will appear
        // also it will take look and feel from its parent
        int option = openChooser.showOpenDialog(component);
        if (option == JFileChooser.APPROVE_OPTION) {

            try {
                String filePath = openChooser.getSelectedFile().getPath();
                reader = new BufferedReader(new FileReader(filePath));
                String line;
                while (Objects.nonNull(line = reader.readLine())) {
                    textArea.append(line + "\n");
                }
            } catch (IOException ex) {
                LOGGER.error("IOException occured ");
            } finally {
                if (Objects.nonNull(reader)) {
                    try {
                        reader.close();
                    } catch (IOException ex) {
                        LOGGER.error("An error occurred during the closing thread");
                    }
                }
            }

        }
    }

    public static void addSaveAction(JTextArea textArea, Component component) {

        JFileChooser fileChooser = new JFileChooser();
        BufferedWriter writer = null;
        //parameter in .showSaveDialog is a parent component around which file chooser will appear
        // also it will take look and feel from its parent
        int option = fileChooser.showSaveDialog(component);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getPath();
            if (!filePath.contains(".txt")) {
                filePath += ".txt";
            }
            try {
                writer = new BufferedWriter(new FileWriter(filePath));
                writer.write(textArea.getText());

            } catch (IOException ex) {
                LOGGER.error("IOException occured ");
            } finally {
                try {
                    if (Objects.nonNull(writer)) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    LOGGER.error("An error occurred during the closing thread");
                }
            }

        }

    }
}
