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
        duckType.swim(g, this);
        duckType.sound(g, this);
        fly(g);
        duckType.display(g, this);
    }

    public void fly(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("날다", x - DUCK_SIZE, y + DUCK_SIZE);
    }
}
