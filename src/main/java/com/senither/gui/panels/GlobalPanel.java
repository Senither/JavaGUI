package com.senither.gui.panels;

import com.senither.gui.Application;
import com.senither.gui.constants.BackgroundColor;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GlobalPanel extends JPanel {

    public GlobalPanel(Application application) {
        setLayout(new BorderLayout());
        add(new ContentPanel(), BorderLayout.CENTER);
        add(new TitlebarPanel(application), BorderLayout.PAGE_START);
        setBorder(new LineBorder(BackgroundColor.DARK, 0));
    }
}