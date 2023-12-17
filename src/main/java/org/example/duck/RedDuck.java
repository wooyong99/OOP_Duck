package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;
import org.example.strategy.quack.QuackStrategyImpl;
import org.example.strategy.swim.SwimStrategyImpl;

public class RedDuck extends Duck {

    public RedDuck(int idx) {
        super();
        this.idx = idx;
        this.type = "RedDuck";
        this.color = Color.RED;
        this.swimStrategy = new SwimStrategyImpl();
        this.soundStrategy = new QuackStrategyImpl();
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLACK);
        String msg = idx + "번 " + type;
        g.drawString(msg, x - DUCK_SIZE, y - DUCK_SIZE);
        swimStrategy.swim(g, this);
        soundStrategy.quack(g, this);
        fly(g);
        g.setColor(color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
    }

    public void fly(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("날다", x - DUCK_SIZE, y + DUCK_SIZE);
    }
}
