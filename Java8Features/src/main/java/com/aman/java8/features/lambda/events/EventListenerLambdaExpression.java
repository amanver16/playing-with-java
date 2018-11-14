package com.aman.java8.features.lambda.events;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventListenerLambdaExpression {

    public static void main(String[] args) {

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);
        JButton button = new JButton("Click Me");
        button.setBounds(80, 100, 70, 30);

        // Lambda expression for button click event
        button.addActionListener(clickEvent -> {
            textField.setText("Hello Aman");
        });

        JFrame frame = new JFrame();
        frame.add(textField);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }

}