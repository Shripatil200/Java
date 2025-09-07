package com.example.generics.inheritance.non_generic_subclass;

public class Box<T> {
    private T item;

    public T getItem(){
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }

    public void displayItemType(){
        System.out.println("The type of the item is: " + item.getClass().getName());
    }







}
