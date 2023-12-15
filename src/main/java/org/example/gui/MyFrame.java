package org.example.gui;

import java.awt.Frame;
import java.awt.Graphics;
import org.example.duck.Duck;

public class MyFrame extends Frame {
    private static Duck[] duckList = new Duck[10];
    public final static int FRAME_WIDTH = 800;
    public final static int FRAME_HEIGHT = 600;


    public MyFrame() {
        super();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        addDuckList();
        displayDuckList(g);
    }

    // Duck생성 후 DuckList에 추가
    private void addDuckList() {
        for (int i = 0; i < duckList.length; i++) {
            if (duckList[i] == null) {
                duckList[i] = Duck.create();
                return;
            }
        }
    }

    private void displayDuckList(Graphics g) {
        for (int i = 0; i < duckList.length; i++) {
            if (duckList[i] == null) {
                return;
            }
            duckList[i].display(g);
        }
    }
}
