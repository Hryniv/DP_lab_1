package org.example.interfaceComponents.panels;

import org.example.interfaceComponents.buttons.CreateGroupButton;
import org.example.interfaceComponents.frames.ProgramFrame;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ThreadGroupInitPanel extends JPanel {
    private final Color COLOR = new Color(11, 220, 153, 255);
    private ProgramFrame programFrame;
    private int NUMBER = 0;

    public ThreadGroupInitPanel() {
        Border grayBorder = BorderFactory.createLineBorder(Color.GRAY, 2);

        /**  panel settings */
        this.setPreferredSize(new Dimension(400, 50));
        this.setMaximumSize(new Dimension(400, 200));
        this.setBorder(grayBorder);
        this.setBackground(COLOR);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        /** name */
        // create group name label
        JLabel groupNameLabel = new JLabel("Group name:");
        groupNameLabel.setFont(new Font("Arial", Font.BOLD, 12));
        // create group name textField
        JTextField groupNameTextField = new JTextField();
        groupNameTextField.setPreferredSize(new Dimension(100, 30));
        groupNameTextField.setFont(new Font("Arial", Font.BOLD, 12));
        // panel for name
        JPanel namePanel = new JPanel();
        namePanel.setLayout(new FlowLayout());
        namePanel.setBackground(COLOR);
        namePanel.add(groupNameLabel);
        namePanel.add(groupNameTextField);

        /** number */
        // create number label
        JLabel numberLabel = new JLabel("Number of threads:");
        numberLabel.setFont(new Font("Arial", Font.BOLD, 12));
        // create textFields for increment number of threads
        JTextField numberTextField = new JTextField();
        numberTextField.setPreferredSize(new Dimension(100, 30));
        numberTextField.setFont(new Font("Arial", Font.BOLD, 12));
        // panel for numbers
        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new FlowLayout());
        numberPanel.setBackground(COLOR);
        numberPanel.add(numberLabel);
        numberPanel.add(numberTextField);

        /** priority */
        // create group priority label
        JLabel priorityLabel = new JLabel("Thread's priority:");
        priorityLabel.setFont(new Font("Arial", Font.BOLD, 12));
        // create textFields for increment thread's priority
        JTextField priorityTextField = new JTextField();
        priorityTextField.setPreferredSize(new Dimension(100, 30));
        priorityTextField.setFont(new Font("Arial", Font.BOLD, 12));
        // panel for priority
        JPanel priorityPanel = new JPanel();
        priorityPanel.setBackground(COLOR);
        priorityPanel.add(priorityLabel);
        priorityPanel.add(priorityTextField);

        /** create group button */
        CreateGroupButton createGroupButton = new CreateGroupButton();
        createGroupButton.setThreadGroupInitPanel(this);
        createGroupButton.setGroupNameTextField(groupNameTextField);
        createGroupButton.setPriorityTextField(priorityTextField);
        createGroupButton.setNumberTextField(numberTextField);
        /*

        /** add all panels */
        this.add(namePanel);
        this.add(numberPanel);
        this.add(priorityPanel);

        this.add(createGroupButton);
    }

    public ProgramFrame getProgramFrame() {
        return programFrame;
    }

    public void setProgramFrame(ProgramFrame programFrame) {
        this.programFrame = programFrame;
    }
}
