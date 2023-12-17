package org.example.duck;

import static org.example.duck.Duck.DUCK_SIZE;

import java.awt.Color;
import java.awt.Graphics;
import org.example.strategy.quack.BBikStrategyImpl;
import org.example.strategy.quack.DDackStrategyImpl;
import org.example.strategy.quack.QuackStrategyImpl;
import org.example.strategy.quack.SoundStrategy;
import org.example.strategy.swim.SwimStrategy;
import org.example.strategy.swim.SwimStrategyImpl;

public enum DuckType {
    RED("RedDuck", new SwimStrategyImpl(), new QuackStrategyImpl()),
    MALLARD("MallardDuck", new SwimStrategyImpl(), new QuackStrategyImpl()),
    DECOY("DecoyDuck", new SwimStrategyImpl(), new DDackStrategyImpl()),
    RUBBER("RubberDuck", new SwimStrategyImpl(), new BBikStrategyImpl());
    private String typeName;
    private SoundStrategy soundStrategy;
    private SwimStrategy swimStrategy;

    DuckType(String typeName, SwimStrategy swimStrategy) {
        this.typeName = typeName;
        this.swimStrategy = swimStrategy;
    }

    DuckType(String typeName, SwimStrategy swimStrategy, SoundStrategy soundStrategy) {
        this.typeName = typeName;
        this.swimStrategy = swimStrategy;
        this.soundStrategy = soundStrategy;
    }

    public void display(Graphics g, Duck duck) {
        String msg = duck.idx + "번 " + duck.duckType.getName();
        g.drawString(msg, duck.x - DUCK_SIZE, duck.y - DUCK_SIZE);
        g.setColor(duck.color);
        g.fillOval(duck.x, duck.y, DUCK_SIZE, DUCK_SIZE);
    }

    public void swim(Graphics g, Duck duck) {
        g.setColor(Color.BLACK);
        this.swimStrategy.swim(g, duck);
    }

    public void sound(Graphics g, Duck duck) {
        this.soundStrategy.quack(g, duck);
    }

    public String getName() {
        return this.typeName;
    }
}
