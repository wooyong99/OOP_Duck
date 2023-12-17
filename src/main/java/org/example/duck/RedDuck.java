package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {

    public RedDuck(int idx) {
        super();
        this.idx = idx;
        this.duckType = DuckType.RED;
        this.color = Color.RED;
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLACK);
        String msg = idx + "번 " + duckType.getName();
        g.drawString(msg, x - DUCK_SIZE, y - DUCK_SIZE);
        duckType.swim(g, this);
        duckType.sound(g, this);
        fly(g);
        g.setColor(color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
    }

    public void fly(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("날다", x - DUCK_SIZE, y + DUCK_SIZE);
    }
}
