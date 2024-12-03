package com.greenguards;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {
    public ContentPanel() {
        setLayout(new BorderLayout());

        // Banner Section
        JPanel bannerPanel = new JPanel(new GridBagLayout());
        bannerPanel.setBackground(new Color(144, 238, 144)); // Light Green
        JLabel bannerLabel = new JLabel("<html><center>Welcome to Green Guards!<br>Join us in making a difference.</center></html>");
        bannerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        bannerPanel.add(bannerLabel);

        // Features Section
        JPanel featuresPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        featuresPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Feature Boxes
        featuresPanel.add(createFeatureBox("Waste Materials Corner", "images/waste_icon.png"));
        featuresPanel.add(createFeatureBox("Plants Corner", "images/plants_icon.png"));
        featuresPanel.add(createFeatureBox("Stray Animals Corner", "images/animals_icon.png"));

        // Add banner and features to Content Panel
        add(bannerPanel, BorderLayout.NORTH);
        add(featuresPanel, BorderLayout.CENTER);
    }

    // Method to create individual feature boxes
    private JPanel createFeatureBox(String title, String iconPath) {
        JPanel featureBox = new JPanel(new BorderLayout());
        featureBox.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

        // Icon
        JLabel iconLabel = new JLabel(new ImageIcon(iconPath), SwingConstants.CENTER);

        // Title
        JLabel titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        featureBox.add(iconLabel, BorderLayout.CENTER);
        featureBox.add(titleLabel, BorderLayout.SOUTH);

        return featureBox;
    }
}

