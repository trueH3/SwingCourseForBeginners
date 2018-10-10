/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingGridbag;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class YpanelGridbag extends JPanel {
    
    private JButton submitBtn, right1Btn, right2Btn, right3Btn, right4Btn;
    private JLabel firstNameLabel, lastNameLabel, formTitleLabel;
    private JTextField firstNameTf, lastNameTf;
    private JTextArea messageTa;
    private JCheckBox agreeTermsChbox;
    
    private GridBagConstraints constraints;
    
    public YpanelGridbag() {
        
        setLayout(new GridBagLayout());
        createComponents();
        constraints = new GridBagConstraints();
        addAllComponents();
    }
    
    private void createComponents() {
        formTitleLabel = new JLabel("form title");
        firstNameLabel = new JLabel("first name");
        firstNameTf = new JTextField(5);
        lastNameLabel = new JLabel("Last name");
        lastNameTf = new JTextField(5);
        messageTa = new JTextArea(5, 20);
        agreeTermsChbox = new JCheckBox("Agree to terms");
        submitBtn = new JButton("submit");
        right1Btn = new JButton("Right1");
        right2Btn = new JButton("Right2");
        right3Btn = new JButton("Right3");
        right4Btn = new JButton("Right4");
    }
    
    private void addAllComponents() {
        constraints.insets = new Insets(0, 0, 0, 0);
        
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        add(formTitleLabel, constraints);
        
        constraints.gridwidth = 1;
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(firstNameLabel, constraints);
        
        constraints.gridx = 3;
        add(firstNameTf, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 2;
        add(lastNameLabel, constraints);
        
        constraints.gridx= 3;
        add(lastNameTf, constraints);
        
        //top, left, bottom, right
        constraints.insets = new Insets(0,0, 10, 0);
        constraints.gridx = 3;
        constraints.gridy = 3;
        add(messageTa, constraints);
        
        constraints.gridx =3;
        constraints.gridy =4;
        add(submitBtn, constraints);
        
        constraints.gridx = 4;
        add(agreeTermsChbox, constraints);
        
        constraints.ipady = 32;
        constraints.gridy = 1;
        constraints.gridx = 4;
        add(right1Btn, constraints);
        
        constraints.gridx = 5;
        add(right2Btn, constraints);
        
        constraints.gridy =2;
        constraints.gridx = 4;
        add(right3Btn, constraints);
        
        constraints.gridx = 5;
        add(right4Btn, constraints);
        
        
        
        
    }
    
}
