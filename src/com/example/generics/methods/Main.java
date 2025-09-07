package com.example.generics.methods;

public class Main {

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        Integer[] numArray =  {1,2,5,6};
        genericMethod.printArray(numArray);

        String[] names = {"Shri", "Ram", "Shriram", "Patil"};
        genericMethod.printArray(names);
    }
}
