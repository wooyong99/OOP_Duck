package org.example.gui;

import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame extends Frame {
    public final static int FRAME_WIDTH = 800;
    public final static int FRAME_HEIGHT = 600;


    public MyFrame() {
        super();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("실행");
    }
}
