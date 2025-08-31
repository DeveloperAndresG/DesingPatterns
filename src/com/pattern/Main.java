package com.pattern;

import com.pattern.creational.singleton.Singleton;
import com.pattern.estructural.adapter.Adapter;
import com.pattern.estructural.adapter.Target;
import com.pattern.estructural.bridge.Abstraction;
import com.pattern.estructural.bridge.ConcreteImplementorA;
import com.pattern.estructural.bridge.Implementor;
import com.pattern.estructural.bridge.RefinedAbstraction;
import com.pattern.creational.abstractfactory.AbstractFactoryPattern;
import com.pattern.creational.builder.BuilderPattern;
import com.pattern.creational.factorymethod.FactoryMethodPattern;
import com.pattern.creational.prototype.PrototypePattern;
import com.pattern.estructural.composite.CompositePattern;
import com.pattern.estructural.decorator.DecoratorPattern;
import com.pattern.estructural.facade.FacadePattern;
import com.pattern.estructural.flyweight.FlyweightPattern;
import com.pattern.estructural.proxy.ProxyPattern;
import com.pattern.behavior.chainofresponsibility.ChainOfResponsibilityPattern;
import com.pattern.behavior.command.CommandPattern;
import com.pattern.behavior.interpreter.InterpreterPattern;
import com.pattern.behavior.iterator.IteratorPattern;
import com.pattern.behavior.mediator.MediatorPattern;
import com.pattern.behavior.memento.MementoPattern;
import com.pattern.behavior.observer.ObserverPattern;
import com.pattern.behavior.state.StatePattern;
import com.pattern.behavior.strategy.StrategyPattern;
import com.pattern.behavior.templatemethod.TemplateMethodPattern;
import com.pattern.behavior.visitor.VisitorPattern;

public class Main {

	public static void main(String[] args) {
		// --- CREATIONAL PATTERNS ---
		System.out.println("---Singleton---");
		Singleton singleton = Singleton.getInstance();
		System.out.println("---Factory Method---");
		FactoryMethodPattern.demonstrate();
		System.out.println("---Abstract Factory---");
		AbstractFactoryPattern.demonstrate();
		System.out.println("---Builder---");
		BuilderPattern.demonstrate();
		System.out.println("---Prototype---");
		PrototypePattern.demonstrate();

		// --- STRUCTURAL PATTERNS ---
		System.out.println("---Adapter---");
		Target target = new Adapter();
		target.request();
		System.out.println("---Bridge---");
		Implementor implementor = new ConcreteImplementorA();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.operation();
		System.out.println("---Composite---");
		CompositePattern.demonstrate();
		System.out.println("---Decorator---");
		DecoratorPattern.demonstrate();
		System.out.println("---Facade---");
		FacadePattern.demonstrate();
		System.out.println("---Flyweight---");
		FlyweightPattern.demonstrate();
		System.out.println("---Proxy---");
		ProxyPattern.demonstrate();

		// --- BEHAVIORAL PATTERNS ---
		System.out.println("---Chain of Responsibility---");
		ChainOfResponsibilityPattern.demonstrate();
		System.out.println("---Command---");
		CommandPattern.demonstrate();
		System.out.println("---Interpreter---");
		InterpreterPattern.demonstrate();
		System.out.println("---Iterator---");
		IteratorPattern.demonstrate();
		System.out.println("---Mediator---");
		MediatorPattern.demonstrate();
		System.out.println("---Memento---");
		MementoPattern.demonstrate();
		System.out.println("---Observer---");
		ObserverPattern.demonstrate();
		System.out.println("---State---");
		StatePattern.demonstrate();
		System.out.println("---Strategy---");
		StrategyPattern.demonstrate();
		System.out.println("---Template Method---");
		TemplateMethodPattern.demonstrate();
		System.out.println("---Visitor---");
		VisitorPattern.demonstrate();
	}

}