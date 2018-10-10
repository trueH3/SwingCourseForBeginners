/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingfreecourse;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ypanel_lessonTable extends JPanel {

    private JTable tableArray;
    private JButton firstButton;
    private JTextField tf;
    private JButton submitBtn;

    public Ypanel_lessonTable() {

        createTableFromArray();
        createButtons();
        createPopupAfterFillingTf();
    }

    private void createTableFromArray() {

        Object columnNames[] = {"first name", "last name", "age"};
        Object data[][] = {
            {"Szymon", "Truszczyński", "30"},
            {"Marek", "Truszczyński", "62"}
        };

        //DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        tableArray = new JTable(data, columnNames);
        add(new JScrollPane(tableArray));
    }

    private void createButtons() {
        firstButton = new JButton("hit me!");
        firstButton.addActionListener((ActionEvent ae) -> {
            //JButton clickedButton = (JButton) ae.getSource();
            System.out.println("poszedł event ");
                firstButton.setBackground(Color.CYAN);
                createPopUp();
            
        });

        add(firstButton);
    }

    private void createPopUp() {
//first param is name of parent component, watch out for word internal in other methods
        String textFromPopup = JOptionPane.showInputDialog(this, "write something", "title", JOptionPane.CANCEL_OPTION);
        JOptionPane.showMessageDialog(this, textFromPopup, "you wrote", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void createPopupAfterFillingTf(){
    submitBtn = new JButton("Submit");
        
                submitBtn.addActionListener((ActionEvent ev) -> {
            System.out.println("poszedł event: "+ev);
         String writtenText = tf.getText();
                submitBtn.setBackground(Color.LIGHT_GRAY);
                JOptionPane.showMessageDialog(this, writtenText, "you wrote", JOptionPane.INFORMATION_MESSAGE);        
        });
        add(submitBtn);
        tf = new JTextField("write your text", 36);
        add(tf);
    }
}
