package org.example.interfaceComponents.buttons;

import org.example.interfaceComponents.frames.ProgramFrame;
import org.example.models.SynchronousCounter;
import org.example.Worker;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SynchronousButton extends JButton implements ActionListener {

    private JFrame superFrame;

    public void setSuperFrame(JFrame superFrame) {
        this.superFrame = superFrame;
    }

    public SynchronousButton() {
        this.setPreferredSize(new Dimension(150, 40));
        this.setText("Synchronous");
        addActionListener(this);
        this.setFocusable(false);
        this.setBackground(new Color(20, 91, 175));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Worker.setCounter(new SynchronousCounter());
        superFrame.dispose();
        new ProgramFrame();
    }
}
