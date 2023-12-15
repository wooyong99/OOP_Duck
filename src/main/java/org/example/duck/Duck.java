package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import org.example.gui.MyFrame;

public abstract class Duck {
    protected static Random rnd = new Random();
    public final static int DUCK_SIZE = 40;
    protected int x;
    protected int y;
    protected Color color;

    public Duck() {
        this.x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;//50~750
        this.y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;//70~530
    }

    public static Duck create() {
        switch (rnd.nextInt(2)) {
            case 0:
                return new MallardDuck();
            case 1:
                return new RedDuck();
        }
        return null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void display(Graphics g);

    public abstract void swim();

    public abstract void quack();

    public Color getColor() {
        return this.color;
    }
}
