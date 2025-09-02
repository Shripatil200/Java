package com.example.NestedClass;


// Anonymous Inner class is used when we don't want to create subclass of a base class or interface but still want to implement its functionality
// We can use it to implement functionality of abstract class and interface
// best practice is to implement functionality of functional interface.

// it can access instance and static variables from base class
// it can access static variables from class in which it is initialized
// it can access method scope variable
// it can access its own instance variable and local variables

abstract class Car{
    int instanceVar = 5;
    static int classVar = 40;
    public abstract void display();
}

public class AnonymousClass {
    static int implementedClassVar = 200;



    public static void main(String[] args) {

        int methodVar = 50;

        Car toyota = new Car() {
            final int innerVar = 100;
            @Override
            public void display() {
                int localVar = 150;
                System.out.println("This is toyota car");
                System.out.println(instanceVar + classVar + methodVar + innerVar + localVar + implementedClassVar);
            }
        };

        toyota.display();


        Thread t1 = new Thread() {

            @Override
            public void run() {
                System.out.println("This is a thread");
            }
        };

        t1.start();


        Runnable task  = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is using Runnable Interface");
            }
        };

        Thread t2 = new Thread(task);
        t2.start();

    }
}
