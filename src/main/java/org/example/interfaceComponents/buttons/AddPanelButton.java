package org.example.interfaceComponents.buttons;

import org.example.interfaceComponents.panels.ThreadInitPanel;
import org.example.interfaceComponents.frames.ProgramFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPanelButton extends JButton implements ActionListener {
    private ProgramFrame programFrame;

    public AddPanelButton() {
        this.setText("+");
        this.setFocusable(false);
        this.addActionListener(this);
    }

    public void setProgramFrame(ProgramFrame programFrame) {
        this.programFrame = programFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        programFrame.remove(this);
        ThreadInitPanel threadInitPanel = new ThreadInitPanel();
        threadInitPanel.setProgramFrame(programFrame);
        programFrame.add(threadInitPanel);
        programFrame.add(this);

        programFrame.revalidate();
        programFrame.repaint();
    }
}
