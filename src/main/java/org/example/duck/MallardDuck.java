package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;
import org.example.strategy.FlyStrategy;

public class MallardDuck extends Duck implements FlyStrategy {

    public MallardDuck(int idx) {
        super();
        this.idx = idx;
        this.type = "MallardDuck";
        this.color = Color.BLUE;
    }

    @Override
    public void display(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
        String msg = idx + "번 " + type;
        g.drawString(msg, x - DUCK_SIZE, y - DUCK_SIZE);
        swim(g);
        quack(g);
        fly(g);
    }

    @Override
    public void quack(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("꽥꽥", x + DUCK_SIZE, y);
    }


    @Override
    public void fly(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("날다", x - DUCK_SIZE, y + DUCK_SIZE);
    }
}
