package com.example.generics.multiple_types;

/*
You can pass multiple types to a generic class by simply including more than one type parameter within the angle brackets (< >), separated by commas. This allows a single class to be flexible enough to handle different kinds of data simultaneously, creating more versatile and reusable code.

A common use case for multiple generic types is a Pair or Tuple class, which holds two different types of objects.
 */


public class Pair <K , V>{

    private final K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
