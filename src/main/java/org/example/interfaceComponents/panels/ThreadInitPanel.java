package org.example.interfaceComponents.panels;

import org.example.interfaceComponents.buttons.CreateButton;
import org.example.interfaceComponents.frames.ProgramFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ThreadInitPanel extends JPanel {
    private ProgramFrame programFrame;
    public ThreadInitPanel() {
        Border grayBorder = BorderFactory.createLineBorder(Color.GRAY, 2);

        /**  panel settings */
        this.setPreferredSize(new Dimension(400, 50));
        this.setMaximumSize(new Dimension(400, 50));
        this.setBackground(Color.LIGHT_GRAY);
        this.setBorder(grayBorder);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        /** create labels */
        JLabel threadNameLabel = new JLabel("Name:");

        JLabel threadPriorityLabel = new JLabel("Priority:");

        /** create textFields for thread initialization */
        JTextField threadName = new JTextField();
        threadName.setPreferredSize(new Dimension(100, 30));
        threadName.setFont(new Font("Arial", Font.BOLD, 12));
        threadName.setHorizontalAlignment(JTextField.LEFT);

        JTextField threadPriority = new JTextField();
        threadPriority.setPreferredSize(new Dimension(40, 30));
        threadPriority.setFont(new Font("Arial", Font.BOLD, 12));
        threadPriority.setHorizontalAlignment(JTextField.LEFT);


        /** create buttons for panel */
        CreateButton createButton = new CreateButton();
        createButton.setThreadInitPanel(this);
        createButton.setNameTextField(threadName);
        createButton.setPriorityTextField(threadPriority);

        /** add all components */
        this.add(threadNameLabel);
        this.add(threadName);
        this.add(threadPriorityLabel);
        this.add(threadPriority);
        this.add(createButton);
    }

    public ProgramFrame getProgramFrame() {
        return programFrame;
    }

    public void setProgramFrame(ProgramFrame programFrame) {
        this.programFrame = programFrame;
    }
}
