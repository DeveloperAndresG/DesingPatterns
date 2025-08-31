package com.pattern.estructural.composite;

import java.util.ArrayList;
import java.util.List;

// Component
interface Component {
    void operation();
}
// Leaf
class Leaf implements Component {
    private String name;
    public Leaf(String name) { this.name = name; }
    public void operation() {
        System.out.println("Leaf " + name + " operation");
    }
}
// Composite
class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    private String name;
    public Composite(String name) { this.name = name; }
    public void add(Component component) { children.add(component); }
    public void operation() {
        System.out.println("Composite " + name + " operation");
        for (Component child : children) {
            child.operation();
        }
    }
}

public class CompositePattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Composite pattern");
        Composite root = new Composite("root");
        root.add(new Leaf("A"));
        root.add(new Leaf("B"));
        Composite sub = new Composite("sub");
        sub.add(new Leaf("C"));
        root.add(sub);
        root.operation();
    }
}