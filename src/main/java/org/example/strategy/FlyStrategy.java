package org.example.strategy;

import java.awt.Graphics;

public interface FlyStrategy extends SoundStrategy {
    void fly(Graphics g);
}
