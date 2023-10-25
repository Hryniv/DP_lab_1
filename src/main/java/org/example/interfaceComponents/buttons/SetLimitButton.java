package org.example.interfaceComponents.buttons;

import org.example.Worker;
import org.example.interfaceComponents.frames.ProgramFrame;
import org.example.interfaceComponents.panels.SetLimitPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetLimitButton extends JButton implements ActionListener {
    private SetLimitPanel setLimitPanel;
    private JTextField limitTextField;

    public SetLimitButton() {
        this.setText("Set");
        this.setFont(new Font("Arial", Font.BOLD, 15));
        this.setBackground(new Color(0x32FA32));
        this.setPreferredSize(new Dimension(90, 40));
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // setting limit for workers
        Worker.setLimit(Integer.parseInt(limitTextField.getText()));

        // deleting this panel from programFrame
        ProgramFrame programFrame = setLimitPanel.getProgramFrame();
        programFrame.remove(setLimitPanel);
        programFrame.repaint();

        /** created button that add new initialPanels for thread */
        AddPanelButton addPanelButton = new AddPanelButton();
        addPanelButton.setProgramFrame(programFrame);

        /** created button that add new initialPanels for thread */
        AddThreadGroupButton addThreadGroupButton = new AddThreadGroupButton();
        addThreadGroupButton.setProgramFrame(programFrame);

        programFrame.add(addPanelButton);
        programFrame.add(addThreadGroupButton);
        programFrame.repaint();
        programFrame.setVisible(true);
    }

    public void setSetLimitPanel(SetLimitPanel setLimitPanel) {
        this.setLimitPanel = setLimitPanel;
    }

    public JTextField getLimitTextField() {
        return limitTextField;
    }

    public void setLimitTextField(JTextField limitTextField) {
        this.limitTextField = limitTextField;
    }
}
