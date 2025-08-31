package com.pattern.estructural.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("Operación en RefinedAbstraction");
        implementor.operationImpl();
    }
}
