package com.senither.gui.panels;

import com.senither.gui.Application;
import com.senither.gui.constants.BackgroundColor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class TitlebarPanel extends JPanel {

    private final Application app;
    private int x, y;

    public TitlebarPanel(final Application app) {
        this.app = app;

        setBackground(BackgroundColor.DARK);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(4, 10, 6, 10));

        add(createTitleLabel(), BorderLayout.WEST);
        add(createCloseButtonLabel(), BorderLayout.EAST);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

            public void mouseDragged(MouseEvent me) {
                app.getFrame().setLocation(app.getFrame().getLocation().x + me.getX() - x,
                        app.getFrame().getLocation().y + me.getY() - y);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent me) {
                app.getFrame().setLocation(app.getFrame().getLocation().x + me.getX() - x,
                        app.getFrame().getLocation().y + me.getY() - y);
            }
        });
    }

    private JLabel createTitleLabel() {
        JLabel label = new JLabel(app.getTitle());

        label.setOpaque(true);
        label.setBackground(BackgroundColor.DARK);
        label.setForeground(Color.WHITE);

        return label;
    }

    private JLabel createCloseButtonLabel() {
        JLabel label = new JLabel(" \u2573 ");

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.TOP);

        label.setOpaque(true);
        label.setBackground(BackgroundColor.DARK);
        label.setForeground(BackgroundColor.LIGHTER);

        label.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                System.exit(0);
            }
        });

        return label;
    }
}
