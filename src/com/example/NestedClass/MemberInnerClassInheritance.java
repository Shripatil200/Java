package com.example.NestedClass;

//Child class of Member Inner clss can have all functionalities from outer class , Inner Parent class, and its own
// We use outer class object to create Inner class child class object

public class MemberInnerClassInheritance {

    int instaceVariable = 10;
    static int classVariable = 20;

    class InnerClassOne {
        int innerClassOneVariable = 30;
    }

    class InnerCalssTwo extends InnerClassOne{
        int innerClassTwoVariable = 40;

        public void sum(){
            System.out.println(instaceVariable + classVariable + innerClassOneVariable + innerClassTwoVariable);
        }
    }

    public static void main(String[] args) {
        MemberInnerClassInheritance obj = new MemberInnerClassInheritance();
        MemberInnerClassInheritance.InnerCalssTwo obj2 = obj.new InnerCalssTwo();
        obj2.sum();
    }


}
