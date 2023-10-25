package org.example.interfaceComponents.buttons;

import org.example.Worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StartAllButton extends JButton implements ActionListener {
    private List<Worker> workers;

    public StartAllButton() {
        this.setText("Start all");
        this.setPreferredSize(new Dimension(90, 40));
        addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Worker worker : workers) {
            worker.start();
        }
        this.setEnabled(false);
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
