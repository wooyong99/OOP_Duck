package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck {

    public MallardDuck(int idx) {
        super();
        this.idx = idx;
        this.type = "MallardDuck";
        this.color = Color.BLUE;
    }

    @Override
    public void display(Graphics g) {
        g.setColor(this.color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
        String msg = idx + "번 " + type;
        g.drawString(msg, x, y - 10);
    }

    @Override
    public void swim() {
    }

    @Override
    public void quack() {
    }
}
