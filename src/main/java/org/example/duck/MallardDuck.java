package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.color = Color.BLUE;
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
