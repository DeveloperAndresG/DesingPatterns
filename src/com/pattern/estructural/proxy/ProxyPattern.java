package com.pattern.estructural.proxy;

// Subject interface
interface Subject {
    void request();
}

// Real Subject
class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject handling request");
    }
}

// Proxy
class Proxy implements Subject {
    private RealSubject realSubject;

    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("Proxy delegating to RealSubject");
        realSubject.request();
    }
}

public class ProxyPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Proxy pattern");
        Subject proxy = new Proxy();
        proxy.request();
    }
}