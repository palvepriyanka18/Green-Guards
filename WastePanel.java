package com.greenguards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WastePanel extends JPanel {
    public WastePanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(245, 245, 245));  // Light gray background

        // Create and style the button
        JButton viewWasteButton = new JButton("View Waste Feed");
        viewWasteButton.setBackground(new Color(56, 142, 60)); // Green color
        viewWasteButton.setForeground(Color.WHITE);
        viewWasteButton.setFont(new Font("Arial", Font.BOLD, 14));
        viewWasteButton.setFocusPainted(false);

        viewWasteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the waste feed page when clicked
                FeedPageFrame feedPage = new FeedPageFrame("Waste");
                feedPage.setVisible(true);
            }
        });

        add(viewWasteButton, BorderLayout.CENTER);  // Add button to center
    }
}

