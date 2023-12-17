package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {
    public DecoyDuck(int idx) {
        super();
        this.idx = idx;
        this.duckType = DuckType.DECOY;
        this.color = Color.GREEN;
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLACK);
        String msg = idx + "번 " + duckType.getName();
        g.drawString(msg, x - DUCK_SIZE, y - DUCK_SIZE);
        duckType.swim(g, this);
        duckType.sound(g, this);
        g.setColor(color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
    }
}
