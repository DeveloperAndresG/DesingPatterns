package com.pattern.behavior.interpreter;

// Abstract Expression
interface Expression {
    boolean interpret(String context);
}

// Terminal Expression
class TerminalExpression implements Expression {
    private String data;
    public TerminalExpression(String data) {
        this.data = data;
    }
    public boolean interpret(String context) {
        return context.contains(data);
    }
}

// Or Expression
class OrExpression implements Expression {
    private Expression expr1;
    private Expression expr2;
    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}

public class InterpreterPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Interpreter pattern");
        Expression isHello = new TerminalExpression("Hello");
        Expression isWorld = new TerminalExpression("World");
        Expression helloOrWorld = new OrExpression(isHello, isWorld);
        System.out.println("Interpret 'Hello there': " + helloOrWorld.interpret("Hello there")); // true
        System.out.println("Interpret 'Goodbye': " + helloOrWorld.interpret("Goodbye")); // false
    }
}