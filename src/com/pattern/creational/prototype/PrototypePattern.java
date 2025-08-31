package com.pattern.creational.prototype;

// Prototype interface
interface Prototype {
    Prototype clone();
    void show();
}

// Concrete Prototype
class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    public Prototype clone() {
        return new ConcretePrototype(field);
    }

    public void show() {
        System.out.println("Prototype with field: " + field);
    }
}

public class PrototypePattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Prototype pattern");
        ConcretePrototype original = new ConcretePrototype("value");
        ConcretePrototype copy = (ConcretePrototype) original.clone();
        original.show();
        copy.show();
    }
}