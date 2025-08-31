package com.pattern.behavior.templatemethod;

// Abstract class with template method
abstract class AbstractClass {
    // Template method
    public void templateMethod() {
        stepOne();
        stepTwo();
    }
    abstract void stepOne();
    abstract void stepTwo();
}

// Concrete class
class ConcreteClass extends AbstractClass {
    void stepOne() {
        System.out.println("Step One implemented by ConcreteClass");
    }
    void stepTwo() {
        System.out.println("Step Two implemented by ConcreteClass");
    }
}

public class TemplateMethodPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Template Method pattern");
        AbstractClass obj = new ConcreteClass();
        obj.templateMethod();
    }
}