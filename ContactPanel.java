package com.greenguards;

import javax.swing.*;
import java.awt.*;

public class ContactPanel extends JPanel {
    public ContactPanel() {
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Contact Us", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title, BorderLayout.NORTH);

        JTextArea contactDetails = new JTextArea("Email: support@greenguards.com\nPhone: +1 (234) 567-890");
        contactDetails.setWrapStyleWord(true);
        contactDetails.setLineWrap(true);
        contactDetails.setEditable(false);
        contactDetails.setCaretPosition(0);
        add(contactDetails, BorderLayout.CENTER);
    }
}

