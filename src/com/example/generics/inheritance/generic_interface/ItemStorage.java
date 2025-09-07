package com.example.generics.inheritance.generic_interface;

public class ItemStorage <T> implements Cargo<T>{
    private T item;
    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
