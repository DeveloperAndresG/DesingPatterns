package com.pattern.behavior.visitor;

// Element interface
interface Element {
    void accept(Visitor visitor);
}

// Concrete Element
class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String featureA() {
        return "FeatureA";
    }
}

// Visitor interface
interface Visitor {
    void visit(ConcreteElementA element);
}

// Concrete Visitor
class ConcreteVisitor implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("Visiting " + element.featureA());
    }
}

public class VisitorPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Visitor pattern");
        Element element = new ConcreteElementA();
        Visitor visitor = new ConcreteVisitor();
        element.accept(visitor);
    }
}