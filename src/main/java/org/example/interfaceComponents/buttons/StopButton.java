package org.example.interfaceComponents.buttons;

import org.example.Worker;
import org.example.interfaceComponents.frames.ProgramFrame;
import org.example.interfaceComponents.panels.ThreadInitPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopButton extends JButton implements ActionListener {

    private Worker worker;
    private ThreadInitPanel threadInitPanel;

    public StopButton(Worker worker) {
        this.worker = worker;

        this.setText("Stop");
        this.setPreferredSize(new Dimension(70, 40));
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (worker.isRunning()) {
            worker.setRunning(false);
            /*
            this.setEnabled(false);
            ProgramFrame programFrame = threadInitPanel.getProgramFrame();
            programFrame.remove(threadInitPanel);
            programFrame.repaint();
            programFrame.pack();

             */
        }
    }

    public void setThreadInitPanel(ThreadInitPanel panel) {
        this.threadInitPanel = panel;
    }
}
