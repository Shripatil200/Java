package com.example.generics.inheritance.non_generic_subclass;

// Here Box is a generic class and Storage class which extends box class is non-generic class
// Here's how we can ensure type safety.
public class Storage extends Box<String>{

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.setItem("Pen");

        System.out.println(storage.getItem());

        storage.displayItemType();
    }
}
