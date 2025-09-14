package com.example.interfaces.simple;

interface Bird {
    boolean canFly();
}


public  class Pigeon implements Bird{

    @Override
    public boolean canFly() {
        return true;
    }

    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        System.out.println("pigeon can fly: " + pigeon.canFly());
    }
}
