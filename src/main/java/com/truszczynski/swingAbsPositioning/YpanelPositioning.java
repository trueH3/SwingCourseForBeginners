/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truszczynski.swingAbsPositioning;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class YpanelPositioning extends JPanel {

    private JButton submitBtn, right1Btn, right2Btn, right3Btn, right4Btn;
    private JLabel firstNameLabel, lastNameLabel, formTitleLabel;
    private JTextField firstNameTf, lastNameTf;
    private JTextArea messageTa;
    private JCheckBox agreeTermsChbox;

    public YpanelPositioning() {
        //If i wont set layout null then absolute positioning wont work
        setLayout(null);
        createComponents();
        addAllComponents();
        setBoundsForComponents();
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
    }

    private void setBoundsForComponents() {
        formTitleLabel.setBounds(245, 15, 100, 25);
        firstNameLabel.setBounds(35, 80, 100, 25);
        firstNameTf.setBounds(150, 80, 280, 25);
        lastNameLabel.setBounds(35, 130, 100, 25);
        lastNameTf.setBounds(150, 130, 280, 25);
        messageTa.setBounds(35, 205, 395, 85);
        agreeTermsChbox.setBounds(295, 310, 135, 25);
        submitBtn.setBounds(165, 310, 100, 25);
        //revalidate();
        //repaint();

    }

    private void addAllComponents() {
        add(formTitleLabel);
        add(firstNameLabel);
        add(firstNameTf);
        add(lastNameLabel);
        add(lastNameTf);
        add(messageTa);
        add(agreeTermsChbox);
        add(submitBtn);
    }
}
