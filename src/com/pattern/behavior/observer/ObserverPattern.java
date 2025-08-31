package com.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

// Subject
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    public void attach(Observer observer) { observers.add(observer); }
    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }
    public String getState() { return state; }
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer interface
interface Observer {
    void update();
}

// Concrete Observer
class ConcreteObserver implements Observer {
    private Subject subject;
    public ConcreteObserver(Subject subject) { this.subject = subject; }
    public void update() {
        System.out.println("Observer notified. State is: " + subject.getState());
    }
}

public class ObserverPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Observer pattern");
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        subject.attach(observer1);
        subject.attach(observer2);
        subject.setState("New State");
    }
}