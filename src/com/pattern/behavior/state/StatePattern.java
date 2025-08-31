package com.pattern.behavior.state;

// State interface
interface State {
    void handle(Context context);
}

// Concrete State A
class ConcreteStateA implements State {
    public void handle(Context context) {
        System.out.println("State A handling. Switching to State B.");
        context.setState(new ConcreteStateB());
    }
}

// Concrete State B
class ConcreteStateB implements State {
    public void handle(Context context) {
        System.out.println("State B handling. Switching to State A.");
        context.setState(new ConcreteStateA());
    }
}

// Context
class Context {
    private State state;
    public Context(State state) { this.state = state; }
    public void setState(State state) { this.state = state; }
    public void request() { state.handle(this); }
}

public class StatePattern {
    public static void demonstrate() {
        System.out.println("Demonstrating State pattern");
        Context context = new Context(new ConcreteStateA());
        context.request(); // State A handling. Switching to State B.
        context.request(); // State B handling. Switching to State A.
    }
}