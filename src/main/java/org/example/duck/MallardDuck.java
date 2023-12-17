package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck {

    public MallardDuck(int idx) {
        super();
        this.idx = idx;
        this.duckType = DuckType.MALLARD;
        this.color = Color.BLUE;
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
