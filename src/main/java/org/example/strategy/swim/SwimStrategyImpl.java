package org.example.strategy.swim;

import static org.example.duck.Duck.DUCK_SIZE;

import java.awt.Graphics;
import org.example.duck.Duck;

public class SwimStrategyImpl implements SwimStrategy {
    @Override
    public void swim(Graphics g, Duck duck) {
        g.drawString("수영", duck.getX() - DUCK_SIZE, duck.getY());
    }
}
