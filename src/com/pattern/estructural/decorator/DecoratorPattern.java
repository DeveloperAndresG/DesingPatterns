package com.pattern.estructural.decorator;

// Component interface
interface Component {
    void operation();
}
// Concrete Component
class ConcreteComponent implements Component {
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}
// Decorator base class
abstract class Decorator implements Component {
    protected Component component;
    public Decorator(Component component) { this.component = component; }
    public void operation() { component.operation(); }
}
// Concrete Decorator
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) { super(component); }
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecorator extra operation");
    }
}

public class DecoratorPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Decorator pattern");
        Component component = new ConcreteComponent();
        Component decorated = new ConcreteDecorator(component);
        decorated.operation();
    }
}