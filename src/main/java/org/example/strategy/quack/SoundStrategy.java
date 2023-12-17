package org.example.strategy.quack;

import java.awt.Graphics;
import org.example.duck.Duck;

public interface SoundStrategy {
    void quack(Graphics g, Duck duck);
}
