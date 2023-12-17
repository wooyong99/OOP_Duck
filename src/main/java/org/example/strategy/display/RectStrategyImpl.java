package org.example.strategy.display;

import static org.example.duck.Duck.DUCK_SIZE;

import java.awt.Graphics;
import org.example.duck.Duck;

public class RectStrategyImpl implements DisplayStrategy {
    @Override
    public void display(Graphics g, Duck duck) {
        String msg = duck.getIdx() + "번 " + duck.getDuckType().getName();
        g.drawString(msg, duck.getX() - DUCK_SIZE, duck.getY() - DUCK_SIZE);
        g.setColor(duck.getColor());
        g.fillRect(duck.getX(), duck.getY(), DUCK_SIZE, DUCK_SIZE);
    }
}
