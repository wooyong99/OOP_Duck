package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import org.example.gui.MyFrame;

public abstract class Duck {
    protected static Random rnd = new Random();
    public final static int DUCK_SIZE = 30;
    protected int idx;
    protected int x;
    protected int y;
    protected Color color;
    protected DuckType duckType;

    public Duck() {
        this.x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;//50~750
        this.y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;//70~530
    }

    public static Duck create(int idx) {
        switch (rnd.nextInt(4)) {
            case 0:
                return new MallardDuck(idx);
            case 1:
                return new RedDuck(idx);
            case 2:
                return new RubberDuck(idx);
            case 3:
                return new DecoyDuck(idx);
        }
        return null;
    }

    public abstract void display(Graphics g);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return this.color;
    }

    public DuckType getDuckType() {
        return duckType;
    }

    public int getIdx() {
        return idx;
    }
}
