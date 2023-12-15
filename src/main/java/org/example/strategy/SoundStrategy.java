package org.example.strategy;

import java.awt.Graphics;

public interface SoundStrategy extends DuckStrategy {
    void quack(Graphics g);
}
