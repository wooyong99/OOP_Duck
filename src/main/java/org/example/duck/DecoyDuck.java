package org.example.duck;

import java.awt.Color;

public class DecoyDuck extends Duck {
    public DecoyDuck(int idx) {
        super();
        this.idx = idx;
        this.type = "DecoyDuck";
        this.color = Color.GREEN;
    }
}