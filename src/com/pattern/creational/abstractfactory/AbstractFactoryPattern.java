package com.pattern.creational.abstractfactory;

// Abstract Product A
interface ProductA {
    void doA();
}
// Abstract Product B
interface ProductB {
    void doB();
}
// Concrete Product A1
class ProductA1 implements ProductA {
    public void doA() { System.out.println("ProductA1 doing A"); }
}
// Concrete Product B1
class ProductB1 implements ProductB {
    public void doB() { System.out.println("ProductB1 doing B"); }
}
// Abstract Factory
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
// Concrete Factory 1
class ConcreteFactory1 implements AbstractFactory {
    public ProductA createProductA() { return new ProductA1(); }
    public ProductB createProductB() { return new ProductB1(); }
}

public class AbstractFactoryPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Abstract Factory pattern");
        AbstractFactory factory = new ConcreteFactory1();
        ProductA a = factory.createProductA();
        ProductB b = factory.createProductB();
        a.doA();
        b.doB();
    }
}