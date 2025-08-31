package com.pattern.estructural.facade;

// Subsystem classes
class SubsystemA {
    void operationA() { System.out.println("SubsystemA operation"); }
}
class SubsystemB {
    void operationB() { System.out.println("SubsystemB operation"); }
}
// Facade
class Facade {
    private SubsystemA a = new SubsystemA();
    private SubsystemB b = new SubsystemB();
    void operation() {
        a.operationA();
        b.operationB();
    }
}

public class FacadePattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Facade pattern");
        Facade facade = new Facade();
        facade.operation();
    }
}