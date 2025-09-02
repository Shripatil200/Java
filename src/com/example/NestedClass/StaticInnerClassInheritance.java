package com.example.NestedClass;

class SomeClassTwo{
    static int classVariable = 10;

    static class StaticInnerClass{

        public static void display(){
            System.out.println(classVariable);
        }
    }
}


public class StaticInnerClassInheritance extends SomeClassTwo.StaticInnerClass {

    public static void main(String[] args) {
        display();
    }
}
