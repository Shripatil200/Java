package com.example.NestedClass;

// Static inner clases can access outer class static variables directly and static methods using class-name (even though they are private).
// But it can not access outer class instance variables or methods without outer class object.
 class OuterClassOne {

     private static int ten = 10;
     private int twenty = 20;

     public   void displayOuter(){
         System.out.println(ten + twenty);
     }

    private static  void displayOuterTwo(){
        System.out.println(ten + twenty);
    }

     static class StaticInnerClass{
         public  void display(){
             System.out.println("Outer Class Static Variable: "+ ten);
             System.out.println("Outer Class Instance Variable : "+ twenty); // not allowed

             OuterClassOne obj = new OuterClassOne();
             obj.displayOuter();

             System.out.println(obj.twenty);
             OuterClassOne.displayOuterTwo();
         }
     }
 }


/*
We can access static variable and static methods of static nested class in its outer class using classname even though they are private
but to access instace methods we need to create an object and we can also access private methods & variables of nested class in outer class
but if static inner class is private then we can not create an object of it outside the inner class
 */

 class OuterClassTwo{

     private static class StaticInnerClassTwo{
         static int  innerStaticVariable = 10;
         private static int innerPrivateStaticVariable = 20;
         int innerDefaultVariable = 30;

         private void display(){
             System.out.println("nested class private method");
         }

         private static void display(boolean value){
             System.out.println("nested class private static method ");
         }


     }

     public void displayTwo(){
         System.out.println(StaticInnerClassTwo.innerPrivateStaticVariable);
         System.out.println(StaticInnerClassTwo.innerStaticVariable);
         System.out.println(new StaticInnerClassTwo().innerDefaultVariable);
         new StaticInnerClassTwo().display();

         StaticInnerClassTwo.display(true);
     }
 }

