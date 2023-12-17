package org.example.duck;

import java.awt.Color;
import java.awt.Graphics;
import org.example.strategy.display.CircleStaragyImpl;
import org.example.strategy.display.DisplayStrategy;
import org.example.strategy.display.RectStrategyImpl;
import org.example.strategy.quack.BBikStrategyImpl;
import org.example.strategy.quack.DDackStrategyImpl;
import org.example.strategy.quack.QuackStrategyImpl;
import org.example.strategy.quack.SoundStrategy;
import org.example.strategy.swim.SwimStrategy;
import org.example.strategy.swim.SwimStrategyImpl;

public enum DuckType {
    RED("RedDuck", new CircleStaragyImpl(), new SwimStrategyImpl(), new QuackStrategyImpl()),
    MALLARD("MallardDuck", new CircleStaragyImpl(), new SwimStrategyImpl(), new QuackStrategyImpl()),
    DECOY("DecoyDuck", new CircleStaragyImpl(), new SwimStrategyImpl(), new DDackStrategyImpl()),
    RUBBER("RubberDuck", new RectStrategyImpl(), new SwimStrategyImpl(), new BBikStrategyImpl());
    private String typeName;
    private SoundStrategy soundStrategy;
    private SwimStrategy swimStrategy;
    private DisplayStrategy displayStrategy;

    DuckType(String typeName, DisplayStrategy displayStrategy, SwimStrategy swimStrategy) {
        this.typeName = typeName;
        this.displayStrategy = displayStrategy;
        this.swimStrategy = swimStrategy;
    }

    DuckType(String typeName, DisplayStrategy displayStrategy, SwimStrategy swimStrategy, SoundStrategy soundStrategy) {
        this.typeName = typeName;
        this.displayStrategy = displayStrategy;
        this.swimStrategy = swimStrategy;
        this.soundStrategy = soundStrategy;
    }

    public void display(Graphics g, Duck duck) {
        this.displayStrategy.display(g, duck);
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
