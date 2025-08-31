package com.pattern.behavior.strategy;

// Strategy interface
interface Strategy {
    int doOperation(int a, int b);
}

// Concrete Strategy Add
class OperationAdd implements Strategy {
    public int doOperation(int a, int b) {
        return a + b;
    }
}

// Concrete Strategy Subtract
class OperationSubtract implements Strategy {
    public int doOperation(int a, int b) {
        return a - b;
    }
}

// Context
class Context {
    private Strategy strategy;
    public Context(Strategy strategy) { this.strategy = strategy; }
    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a, b);
    }
}

public class StrategyPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Strategy pattern");
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}