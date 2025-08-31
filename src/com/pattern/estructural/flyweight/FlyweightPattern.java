package com.pattern.estructural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface Flyweight {
    void operation(String extrinsicState);
}
// Concrete Flyweight
class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;
    public ConcreteFlyweight(String intrinsicState) { this.intrinsicState = intrinsicState; }
    public void operation(String extrinsicState) {
        System.out.println("Intrinsic: " + intrinsicState + ", Extrinsic: " + extrinsicState);
    }
}
// Flyweight Factory
class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();
    public Flyweight getFlyweight(String key) {
        flyweights.putIfAbsent(key, new ConcreteFlyweight(key));
        return flyweights.get(key);
    }
}

public class FlyweightPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Flyweight pattern");
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fw1 = factory.getFlyweight("A");
        Flyweight fw2 = factory.getFlyweight("A");
        Flyweight fw3 = factory.getFlyweight("B");
        fw1.operation("first call");
        fw2.operation("second call");
        fw3.operation("third call");
    }
}