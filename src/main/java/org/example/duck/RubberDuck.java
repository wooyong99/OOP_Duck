package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;
import org.example.strategy.SoundStrategy;

public class RubberDuck extends Duck implements SoundStrategy {
    public RubberDuck(int idx) {
        super();
        this.idx = idx;
        this.type = "RubberDuck";
        this.color = Color.YELLOW;
    }

    @Override
    public void display(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
        String msg = idx + "번 " + type;
        g.drawString(msg, x - DUCK_SIZE, y - DUCK_SIZE);
        swim(g);
        quack(g);
    }

    @Override
    public void quack(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("삑삑", x + DUCK_SIZE, y);
    }
}
