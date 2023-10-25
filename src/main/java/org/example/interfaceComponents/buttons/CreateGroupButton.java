package org.example.interfaceComponents.buttons;

import org.example.Worker;
import org.example.interfaceComponents.panels.ThreadGroupInitPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CreateGroupButton extends JButton implements ActionListener {

    private List<Worker> workers = new ArrayList<>();
    private ThreadGroupInitPanel threadGroupInitPanel;
    private JTextField groupNameTextField;
    private JTextField numberTextField;
    private JTextField priorityTextField;

    public CreateGroupButton() {
        this.setText("Create group");
        this.setPreferredSize(new Dimension(90, 40));
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String groupName = groupNameTextField.getText();
        int priority = Integer.parseInt(priorityTextField.getText());
        int number = Integer.parseInt(numberTextField.getText());

        Worker worker;
        for (int i = 0; i < number; i++) {
            worker = new Worker();
            worker.setName("Group " + groupName + ": thread-" + i);
            worker.setPriority(priority);
            workers.add(worker);
        }

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel nameLabel = new JLabel("GROUP " + groupName.toUpperCase());
        nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        namePanel.add(nameLabel);

        JPanel buttons = new JPanel();
        buttons.setBackground(new Color(11, 220, 153, 255));
        buttons.setLayout(new FlowLayout());

        StartAllButton startAllButton = new StartAllButton();
        startAllButton.setWorkers(workers);

        StopAllButton stopAllButton = new StopAllButton();
        stopAllButton.setWorkers(workers);

        ResumeAllButton resumeAllButton = new ResumeAllButton();
        resumeAllButton.setWorkers(workers);

        buttons.add(startAllButton);
        buttons.add(stopAllButton);
        buttons.add(resumeAllButton);

        threadGroupInitPanel.setLayout(new BorderLayout());
        threadGroupInitPanel.removeAll();
        threadGroupInitPanel.add(namePanel, BorderLayout.NORTH);
        threadGroupInitPanel.add(buttons, BorderLayout.SOUTH);
        threadGroupInitPanel.repaint();
        threadGroupInitPanel.revalidate();
    }

    public void setThreadGroupInitPanel(ThreadGroupInitPanel threadGroupInitPanel) {
        this.threadGroupInitPanel = threadGroupInitPanel;
    }

    public void setPriorityTextField(JTextField priorityTextField) {
        this.priorityTextField = priorityTextField;
    }

    public void setGroupNameTextField(JTextField groupNameTextField) {
        this.groupNameTextField = groupNameTextField;
    }

    public void setNumberTextField(JTextField numberTextField) {
        this.numberTextField = numberTextField;
    }
}
