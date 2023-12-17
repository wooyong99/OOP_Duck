package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck {
    public RubberDuck(int idx) {
        super();
        this.idx = idx;
        this.duckType = DuckType.RUBBER;
        this.color = Color.YELLOW;
    }

    @Override
    public void display(Graphics g) {
        duckType.swim(g, this);
        duckType.sound(g, this);
        duckType.display(g, this);
    }
}
