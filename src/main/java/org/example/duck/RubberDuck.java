package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;
import org.example.strategy.quack.BBikStrategyImpl;
import org.example.strategy.swim.SwimStrategyImpl;

public class RubberDuck extends Duck {
    public RubberDuck(int idx) {
        super();
        this.idx = idx;
        this.type = "RubberDuck";
        this.color = Color.YELLOW;
        this.swimStrategy = new SwimStrategyImpl();
        this.soundStrategy = new BBikStrategyImpl();
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLACK);
        String msg = idx + "번 " + type;
        g.drawString(msg, x - DUCK_SIZE, y - DUCK_SIZE);
        swimStrategy.swim(g, this);
        soundStrategy.quack(g, this);
        g.setColor(color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
    }
}
