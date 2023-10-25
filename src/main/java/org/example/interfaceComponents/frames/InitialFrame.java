package org.example.interfaceComponents.frames;

import org.example.interfaceComponents.buttons.AsynchronousButton;
import org.example.interfaceComponents.buttons.SynchronousButton;
import javax.swing.*;
import java.awt.*;

public class InitialFrame extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 200;
    public InitialFrame() {
        /** frame settings */
        this.setSize(WIDTH, HEIGHT);
        this.setTitle("Lab 1");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(new Color(132, 147, 165));

        /** label initialization */
        JLabel label = new JLabel("Chose program's mode");
        label.setFont(new Font("Arial", Font.BOLD, 22));
        label.setHorizontalAlignment(JLabel.CENTER);

        /** panel for buttons */
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setBackground(new Color(132, 147, 165));

        /** buttons initialization */
        AsynchronousButton asynchronousButton = new AsynchronousButton();
        asynchronousButton.setSuperFrame(this);

        SynchronousButton synchronousButton = new SynchronousButton();
        synchronousButton.setSuperFrame(this);

        /** add buttons to the button panel */
        buttonPanel.add(asynchronousButton);
        buttonPanel.add(synchronousButton);

        /** add all components */
        this.add(label, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
