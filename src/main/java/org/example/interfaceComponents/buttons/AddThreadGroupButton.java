package org.example.interfaceComponents.buttons;

import org.example.interfaceComponents.frames.ProgramFrame;
import org.example.interfaceComponents.panels.ThreadGroupInitPanel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddThreadGroupButton extends JButton implements ActionListener {
    private ProgramFrame programFrame;

    public AddThreadGroupButton() {
        this.setText("Add thread group");
        this.setFocusable(false);
        this.addActionListener(this);
    }

    public void setProgramFrame(ProgramFrame programFrame) {
        this.programFrame = programFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        programFrame.remove(this);
        ThreadGroupInitPanel threadGroupInitPanel = new ThreadGroupInitPanel();
        threadGroupInitPanel.setProgramFrame(programFrame);
        programFrame.add(threadGroupInitPanel);

        programFrame.revalidate();
        programFrame.repaint();
        programFrame.pack();
    }
}
