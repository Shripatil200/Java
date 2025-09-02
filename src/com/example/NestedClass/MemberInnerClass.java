package com.example.NestedClass;

// Local inner class can access both instance and class variables  and methods
 class OuterClass{
     int instanceVariable = 10;
     static int classVariable = 20;

     static void print(){
         System.out.println(classVariable);
     }
     void printing(){
        System.out.println(classVariable + instanceVariable);
    }


     class InnerClass{

         int innerClassInstanceVariable = 30;
         static int innerClassVariable = 40;

         public void display(){
             System.out.println(innerClassVariable + classVariable + instanceVariable + innerClassInstanceVariable);
             print();
             printing();
         }
     }

}


// To access inner class outside the outer class we have to create object of outer class and using that object we can initiate inner class.
public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass obj = outerClass.new InnerClass();

        obj.display();
    }
}
