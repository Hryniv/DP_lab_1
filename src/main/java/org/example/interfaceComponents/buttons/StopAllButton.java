package org.example.interfaceComponents.buttons;

import org.example.Worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StopAllButton extends JButton implements ActionListener {
    private List<Worker> workers;

    public StopAllButton() {
        this.setText("Stop all");
        this.setPreferredSize(new Dimension(90, 40));
        addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Worker worker : workers) {
            if (worker.isRunning()) {
                worker.setRunning(false);
            }
        }
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
