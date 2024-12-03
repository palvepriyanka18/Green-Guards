package com.greenguards;

import javax.swing.*;
import java.awt.*;

public class AboutUsPanel extends JPanel {
    public AboutUsPanel() {
        setLayout(new BorderLayout());

        JLabel title = new JLabel("About Us", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title, BorderLayout.NORTH);

        JTextArea description = new JTextArea("Green Guards is committed to environmental protection and community involvement.");
        description.setWrapStyleWord(true);
        description.setLineWrap(true);
        description.setEditable(false);
        description.setCaretPosition(0);
        add(description, BorderLayout.CENTER);
    }
}

