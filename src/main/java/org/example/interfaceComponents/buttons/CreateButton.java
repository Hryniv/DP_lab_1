package org.example.interfaceComponents.buttons;

import org.example.Worker;
import org.example.interfaceComponents.frames.ProgramFrame;
import org.example.interfaceComponents.panels.ThreadInitPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateButton extends JButton implements ActionListener {
    private ThreadInitPanel threadInitPanel;
    private Worker worker;
    private JTextField nameTextField;
    private JTextField priorityTextField;

    public CreateButton() {
        this.setText("Create");
        this.setPreferredSize(new Dimension(90, 40));
        addActionListener(this);
        this.setFocusable(false);
    }

    public void setThreadInitPanel(ThreadInitPanel panel) {
        this.threadInitPanel = panel;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public void setPriorityTextField(JTextField priorityTextField) {
        this.priorityTextField = priorityTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        threadInitPanel.removeAll();
        createWorker();

        JLabel workerInfoLabel = new JLabel(worker.toString());

        StartButton startButton = new StartButton(worker);
        StopButton stopButton = new StopButton(worker);
        //stopButton.setThreadInitPanel(threadInitPanel);
        ResumeButton resumeButton = new ResumeButton(worker);

        threadInitPanel.add(workerInfoLabel);
        threadInitPanel.add(startButton);
        threadInitPanel.add(resumeButton);
        threadInitPanel.add(stopButton);

        threadInitPanel.revalidate();
        threadInitPanel.repaint();
    }

    private void createWorker() {
        worker = new Worker();
        worker.setName(nameTextField.getText());
        worker.setPriority(Integer.parseInt(priorityTextField.getText()));
    }
}
