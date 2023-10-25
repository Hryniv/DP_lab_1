package org.example.interfaceComponents.panels;

import org.example.interfaceComponents.buttons.SetLimitButton;
import org.example.interfaceComponents.frames.ProgramFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SetLimitPanel extends JPanel {
    private ProgramFrame programFrame;

    public SetLimitPanel() {
        Border grayBorder = BorderFactory.createLineBorder(Color.GRAY, 2);

        /**  panel settings */
        this.setPreferredSize(new Dimension(400, 50));
        this.setMaximumSize(new Dimension(400, 50));
        this.setBackground(new Color(255, 255, 50));
        this.setBorder(grayBorder);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        /** create label */
        JLabel setLimitLabel = new JLabel("Set increment limit:");
        setLimitLabel.setFont(new Font("Arial", Font.BOLD, 15));

        /** create textFields for increment limit */
        JTextField limitTextField = new JTextField();
        limitTextField.setPreferredSize(new Dimension(100, 30));
        limitTextField.setFont(new Font("Arial", Font.BOLD, 15));
        limitTextField.setHorizontalAlignment(JTextField.LEFT);

        /** created set limit button */
        SetLimitButton setLimitButton = new SetLimitButton();
        setLimitButton.setSetLimitPanel(this);
        setLimitButton.setLimitTextField(limitTextField);

        this.add(setLimitLabel);
        this.add(limitTextField);
        this.add(setLimitButton);
    }

    public ProgramFrame getProgramFrame() {
        return programFrame;
    }

    public void setProgramFrame(ProgramFrame programFrame) {
        this.programFrame = programFrame;
    }
}
