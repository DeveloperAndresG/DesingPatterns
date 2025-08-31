package com.pattern.creational.factorymethod;

// Product interface
interface Product {
    void use();
}

// Concrete Product
class ConcreteProduct implements Product {
    public void use() {
        System.out.println("Using ConcreteProduct");
    }
}

// Creator abstract class
abstract class Creator {
    public abstract Product factoryMethod();
    public void someOperation() {
        Product product = factoryMethod();
        product.use();
    }
}

// Concrete Creator
class ConcreteCreator extends Creator {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}

public class FactoryMethodPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Factory Method pattern");
        Creator creator = new ConcreteCreator();
        creator.someOperation();
    }
}