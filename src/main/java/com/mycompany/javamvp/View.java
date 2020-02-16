/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javamvp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vinsfran
 */
public class View {

    private Presenter presenter;
    private JLabel statusLabel;
    private JTextField inputField;

    public View() {
        createUI();
    }

    private void createUI() {
        statusLabel = new JLabel("We update");
        inputField = new JTextField(20);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener((ActionEvent e) -> {
            presenter.login(inputField.getText());
        });
        Box topBox = Box.createHorizontalBox();
        topBox.add(statusLabel);
        topBox.add(Box.createHorizontalStrut(5));
        topBox.add(inputField);
        topBox.add(Box.createHorizontalStrut(5));
        topBox.add(loginButton);

        JFrame frame = new JFrame("JAVA 8 FRAME");
        ((JPanel) frame.getContentPane()).setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(topBox, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    void udateStaus(String result) {
        statusLabel.setText(result);
    }

    void hideInputField() {
       inputField.setVisible(false);
    }

}
