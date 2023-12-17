package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import org.example.gui.MyFrame;
import org.example.strategy.quack.SoundStrategy;
import org.example.strategy.swim.SwimStrategy;

public abstract class Duck {
    protected SoundStrategy soundStrategy;
    protected SwimStrategy swimStrategy;
    protected static Random rnd = new Random();
    public final static int DUCK_SIZE = 30;
    protected int idx;
    protected int x;
    protected int y;
    protected Color color;
    protected String type;

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

    public void display(Graphics g) {
        g.setColor(Color.BLACK);
        String msg = idx + "번 " + type;
        g.drawString(msg, x - DUCK_SIZE, y - DUCK_SIZE);
        swimStrategy.swim(g, this);
        g.setColor(color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return this.color;
    }
}
