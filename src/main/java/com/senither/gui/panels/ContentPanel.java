package com.senither.gui.panels;

import com.senither.JavaGUI;
import com.senither.gui.constants.BackgroundColor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ContentPanel extends JPanel {

    private BufferedImage image;

    public ContentPanel() {
        setBackground(BackgroundColor.LIGHT);

        try {
            image = ImageIO.read(JavaGUI.class.getResourceAsStream("../../orion.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(920, 480);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image, 0, 0, this);
    }
}