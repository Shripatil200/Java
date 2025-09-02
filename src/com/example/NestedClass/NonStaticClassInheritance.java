package com.example.NestedClass;

// to make it work we should create constructor of a child class and make a super() call on outer class object.
class SomeOne{
    int instanceVAr = 20;
    class InnerClass{
        public void display(){
            System.out.println(instanceVAr);
        }

    }
}
public class NonStaticClassInheritance extends SomeOne.InnerClass {
    NonStaticClassInheritance(){
        new SomeOne().super();
    }

    public static void main(String[] args) {
        new NonStaticClassInheritance().show();
    }
    public  void show(){
        display();
    }
}
