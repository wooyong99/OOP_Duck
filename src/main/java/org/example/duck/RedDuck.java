package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {
    public RedDuck() {
        this.color = Color.RED;
    }

    @Override
    public void display(Graphics g) {
        g.setColor(this.color);
        g.fillOval(x, y, DUCK_SIZE, DUCK_SIZE);
    }

    @Override
    public void swim() {
    }

    @Override
    public void quack() {
    }
}
