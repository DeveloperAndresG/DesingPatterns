package com.pattern.behavior.chainofresponsibility;

// Handler interface
interface Handler {
    void setNext(Handler handler);
    void handle(String request);
}

// Concrete Handler A
class ConcreteHandlerA implements Handler {
    private Handler next;
    public void setNext(Handler handler) { this.next = handler; }
    public void handle(String request) {
        if (request.equals("A")) {
            System.out.println("Handled by A");
        } else if (next != null) {
            next.handle(request);
        }
    }
}

// Concrete Handler B
class ConcreteHandlerB implements Handler {
    private Handler next;
    public void setNext(Handler handler) { this.next = handler; }
    public void handle(String request) {
        if (request.equals("B")) {
            System.out.println("Handled by B");
        } else if (next != null) {
            next.handle(request);
        }
    }
}

public class ChainOfResponsibilityPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Chain of Responsibility pattern");
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);
        handlerA.handle("A"); // Handled by A
        handlerA.handle("B"); // Handled by B
        handlerA.handle("C"); // Not handled
    }
}