package org.example.interfaceComponents.frames;

import org.example.Worker;
import org.example.interfaceComponents.panels.SetLimitPanel;
import javax.swing.*;
import java.awt.*;

public class ProgramFrame extends JFrame{
    private static final int WIDTH = 450;
    private static final int HEIGHT = 500;

    public ProgramFrame() {
        /**  frame settings  */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(WIDTH, HEIGHT));
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.getContentPane().setBackground(new Color(123, 50, 250));
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setTitle("Threads Menu");

        /** created panel that set limit for counter */
        SetLimitPanel setLimitPanel = new SetLimitPanel();
        setLimitPanel.setProgramFrame(this);

        this.add(setLimitPanel);
        this.setVisible(true);
    }
}
