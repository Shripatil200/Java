package com.example.NestedClass;


// local inner class can access all outer class variables and methods
// local inner class can access all function block variables or parent block variables
// local inner class can have its own variables and methods.

class SomeClass{
    int instanceVariable = 1;
    static int classVariable = 2;

    public static void show(){
        System.out.println(classVariable);
    }

    public void show2(){
        System.out.println(instanceVariable + classVariable);
    }

    public void display(){
        int methodVariable = 3;

        class InnerClass{
            int innerVar = 4;
            static int innerStatic = 5;

            public void print(){
                System.out.println(instanceVariable + classVariable + methodVariable + innerVar + innerStatic);

                show();
                show2();
            }
        }

        // We can't create object of local inner class outside the parent block
        InnerClass innerClass = new InnerClass();

        innerClass.print();

    }
}


public class LocalClass {

    public static void main(String[] args) {

        SomeClass obj = new SomeClass();
        obj.display();
    }
}
