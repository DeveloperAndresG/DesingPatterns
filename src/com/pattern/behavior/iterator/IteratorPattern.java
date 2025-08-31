package com.pattern.behavior.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPattern {
    public static void demonstrate() {
        System.out.println("Demonstrating Iterator pattern");
        List<String> items = Arrays.asList("A", "B", "C");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println("Item: " + iterator.next());
        }
    }
}