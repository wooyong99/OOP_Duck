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
        duckType.swim(g, this);
        duckType.sound(g, this);
        duckType.display(g, this);
    }
}
