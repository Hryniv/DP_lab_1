package org.example.interfaceComponents.buttons;

import org.example.Worker;
import org.example.interfaceComponents.frames.ProgramFrame;
import org.example.models.AsynchronousCounter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsynchronousButton extends JButton implements ActionListener {
    private JFrame superFrame;

    public AsynchronousButton() {
        this.setPreferredSize(new Dimension(150, 40));
        this.setText("Asynchronous");
        addActionListener(this);
        this.setFocusable(false);
        this.setBackground(new Color(240, 48, 40));
    }

    public void setSuperFrame(JFrame superFrame) {
        this.superFrame = superFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Worker.setCounter(new AsynchronousCounter());
        superFrame.dispose();
        new ProgramFrame();
    }
}
