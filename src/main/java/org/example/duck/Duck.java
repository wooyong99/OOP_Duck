package org.example.duck;

import java.util.Random;
import org.example.gui.MyFrame;

public abstract class Duck {
    private static Random rnd = new Random();
    private int x;
    private int y;

    public Duck() {
        this.x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;//50~750
        this.y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;//70~530
    }

    public abstract void display();

    public abstract void swim();

    public abstract void quack();
}
