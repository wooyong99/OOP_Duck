package org.example.strategy.display;

import java.awt.Graphics;
import org.example.duck.Duck;

public interface DisplayStrategy {
    void display(Graphics g, Duck duck);
}
