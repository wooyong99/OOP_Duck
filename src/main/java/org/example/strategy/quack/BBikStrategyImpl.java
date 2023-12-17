package org.example.strategy.quack;

import static org.example.duck.Duck.DUCK_SIZE;

import java.awt.Color;
import java.awt.Graphics;
import org.example.duck.Duck;

public class BBikStrategyImpl implements SoundStrategy {
    @Override
    public void quack(Graphics g, Duck duck) {
        g.setColor(Color.RED);
        g.drawString("삑삑", duck.getX() + DUCK_SIZE, duck.getY());
    }
}
