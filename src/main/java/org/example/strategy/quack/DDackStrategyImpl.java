package org.example.strategy.quack;

import static org.example.duck.Duck.DUCK_SIZE;

import java.awt.Graphics;
import org.example.duck.Duck;

public class DDackStrategyImpl implements SoundStrategy {
    @Override
    public void quack(Graphics g, Duck duck) {
        g.drawString("딱딱", duck.getX() + DUCK_SIZE, duck.getY());
    }
}
