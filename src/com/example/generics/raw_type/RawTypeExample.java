package com.example.generics.raw_type;

import java.util.ArrayList;
import java.util.List;

public class RawTypeExample {
    public static void main(String[] args) {

        // Raw type list - this is bad practice
        List rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(123); // Compiler allows this, but it's a mistake

        // Now, let's try to retrieve the items
        String str = (String) rawList.get(0); // This works
        System.out.println(str);

        Integer number = (Integer) rawList.get(1); // This works
        System.out.println(number);

        try {
            String anotherStr = (String) rawList.get(1); // This will fail!
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }
    }
}