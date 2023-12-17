package org.example.strategy.swim;

import java.awt.Graphics;
import org.example.duck.Duck;

public interface SwimStrategy {
    void swim(Graphics g, Duck duck);
}
