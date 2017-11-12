package com.senither.gui.panels;

import com.senither.gui.constants.BackgroundColor;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {

    public ContentPanel() {
        setBackground(BackgroundColor.LIGHT);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1600, 920);
    }
}