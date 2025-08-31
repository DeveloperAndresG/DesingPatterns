package com.pattern.behavior.mediator;

// Mediator interface
interface Mediator {
    void send(String message, Colleague colleague);
}

// Concrete Mediator
class ConcreteMediator implements Mediator {
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;
    public void setColleagueA(ColleagueA a) { this.colleagueA = a; }
    public void setColleagueB(ColleagueB b) { this.colleagueB = b; }
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.notify(message);
        } else {
            colleagueA.notify(message);
        }
    }
}

// Colleague abstract class
abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) { this.mediator = mediator; }
}

// Concrete Colleague A
class ColleagueA extends Colleague {
    public ColleagueA(Mediator mediator) { super(mediator); }
    public void send(String message) { mediator.send(message, this); }
    public void notify(String message) { System.out.println("ColleagueA received: " + message); }
}

// Concrete Colleague B
class ColleagueB extends Colleague {
    public ColleagueB(Mediator mediator) { super(mediator); }
    public void send(String message) { mediator.send(message, this); }
    public void notify(String message) { System.out.println("ColleagueB received: " + message); }
}

public class MediatorPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Mediator pattern");
        ConcreteMediator mediator = new ConcreteMediator();
        ColleagueA a = new ColleagueA(mediator);
        ColleagueB b = new ColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);
        a.send("Hello from A");
        b.send("Hello from B");
    }
}