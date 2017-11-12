package com.senither.gui;

import com.senither.gui.movement.ComponentResizer;
import com.senither.gui.panels.GlobalPanel;

import javax.swing.*;
import java.awt.*;

public class Application {

    private final String title;
    private final JFrame frame = new JFrame("Application");

    public Application(String title) {
        this.title = title;

        frame.setUndecorated(true);
        frame.add(new GlobalPanel(this));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        ComponentResizer cr = new ComponentResizer();
        cr.setMinimumSize(new Dimension(300, 300));
        cr.setMaximumSize(new Dimension(1600, 920));
        cr.registerComponent(frame);
        cr.setSnapSize(new Dimension(10, 10));
    }

    public JFrame getFrame() {
        return frame;
    }

    public String getTitle() {
        return title;
    }
}
