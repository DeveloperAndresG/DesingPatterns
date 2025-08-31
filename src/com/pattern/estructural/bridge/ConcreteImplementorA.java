package com.pattern.estructural.bridge;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Operación implementada por ConcreteImplementorA");
    }
}
