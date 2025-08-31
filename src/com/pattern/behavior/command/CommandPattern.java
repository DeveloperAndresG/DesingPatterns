package com.pattern.behavior.command;

// Command interface
interface Command {
    void execute();
}

// Receiver
class Receiver {
    void action() {
        System.out.println("Receiver action executed");
    }
}

// Concrete Command
class ConcreteCommand implements Command {
    private Receiver receiver;
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    public void execute() {
        receiver.action();
    }
}

// Invoker
class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void invoke() {
        command.execute();
    }
}

public class CommandPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Command pattern");
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.invoke();
    }
}