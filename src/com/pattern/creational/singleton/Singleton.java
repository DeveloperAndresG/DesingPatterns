package com.pattern.creational.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("se creo el una instancia nueva");
        }
        else 
        {
        	System.out.println("se rehuso la misma instancia");
		}
        
        return instance;
    }
}