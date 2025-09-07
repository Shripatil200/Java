package com.example.generics.multiple_types;

public class Main {

    public static void main(String[] args) {
        Pair<String , Integer> pair = new Pair<>("One" , 1);
        Pair<Integer, Integer> pair1 = new Pair<>(1, 20);

        System.out.println(pair.getKey()+" : " +pair.getValue());

        pair.setValue(56);
        System.out.println(pair.toString());


        System.out.println(pair1.toString());

    }
}
