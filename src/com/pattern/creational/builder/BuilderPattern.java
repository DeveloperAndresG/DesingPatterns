package com.pattern.creational.builder;

// Product
class Product {
    private String partA;
    private String partB;
    public void setPartA(String partA) { this.partA = partA; }
    public void setPartB(String partB) { this.partB = partB; }
    public void show() {
        System.out.println("Product with: " + partA + ", " + partB);
    }
}
// Builder interface
interface Builder {
    void buildPartA();
    void buildPartB();
    Product getResult();
}
// Concrete Builder
class ConcreteBuilder implements Builder {
    private Product product = new Product();
    public void buildPartA() { product.setPartA("PartA"); }
    public void buildPartB() { product.setPartB("PartB"); }
    public Product getResult() { return product; }
}
// Director
class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}

public class BuilderPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Builder pattern");
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.construct(builder);
        Product product = builder.getResult();
        product.show();
    }
}