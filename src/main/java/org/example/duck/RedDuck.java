package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {

    public RedDuck(int idx) {
        super();
        this.idx = idx;
        this.type = "RedDuck";
        this.color = Color.RED;
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
