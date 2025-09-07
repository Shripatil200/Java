package com.example.generics.inheritance.generic_subclass;

import com.example.generics.inheritance.non_generic_subclass.Box;


// Here we don't need to specify the type at the time of class definition.
// we define type at the time of object creation
// This gives us more flexibility to pass different types.

public class Container<T> extends Box<T> {

    public static void main(String[] args) {
        Container <Integer> container = new Container<>();

        System.out.println(container.getItem());
        container.setItem(45);
        System.out.println(container.getItem());

        container.displayItemType();

    }


}
