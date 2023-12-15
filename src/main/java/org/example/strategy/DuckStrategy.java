package org.example.strategy;

import java.awt.Graphics;

public interface DuckStrategy {
    int DUCK_SIZE = 30;

    void display(Graphics g);

    void swim(Graphics g);
}
