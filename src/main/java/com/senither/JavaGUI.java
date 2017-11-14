package com.senither;

import com.senither.gui.Application;

import javax.swing.*;
import java.io.File;

public class JavaGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Application("Java Application GUI");
            }
        });
    }
}
