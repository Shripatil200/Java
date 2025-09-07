package com.example.generics.inheritance.generic_interface;

/*
Generic classes can also implement generic interfaces. This is common when building a custom data structure that needs to conform to a standard contract, like List or Comparable.
 */

public class Main {

    public static void main(String[] args) {
        Cargo<Double> items = new ItemStorage<>();


        items.add(55.0);


        System.out.println(items.get());

    }
}
