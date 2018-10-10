/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingsavefile;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import javax.swing.JFileChooser;

public class YAction {

    public static void saveFile(Component component, String text) {
        JFileChooser fileChooser = new JFileChooser();
        //parameter component is a parent component around which file chooser will appear
        // also it will take look and feel from its parent
        BufferedWriter writer = null;
        int option = fileChooser.showSaveDialog(component);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getPath();
            if (!filePath.contains(".txt")) {
                filePath += ".txt";
            }
            try {
                writer = new BufferedWriter(new FileWriter(filePath));
                writer.write(text);

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (Objects.nonNull(writer)) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

}
