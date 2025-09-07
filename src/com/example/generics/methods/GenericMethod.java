package com.example.generics.methods;

public class GenericMethod {

    public <E>void printArray(E[] array){
        for(E element : array){
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
