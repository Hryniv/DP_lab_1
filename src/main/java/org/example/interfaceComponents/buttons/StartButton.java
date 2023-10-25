package org.example.interfaceComponents.buttons;

import org.example.Worker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton extends JButton implements ActionListener {
    private Worker worker;
    public StartButton(Worker worker) {
        this.worker = worker;

        this.setText("Start");
        this.setPreferredSize(new Dimension(70, 40));
        addActionListener(this);
        this.setFocusable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        worker.start();
        this.setEnabled(false);
    }
}
