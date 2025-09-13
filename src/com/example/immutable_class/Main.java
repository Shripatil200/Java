package com.example.immutable_class;

/*
we can not change thi value of an object once it is created

Declare class as' final' so that it can not be extended

All class member should be private. So mat can be avoided. direct access

arl initialized only once And class members using constructor.

There should not be any setter methods, which is generally used to change the value.

Just getter methods. And returns the member variable. Copy of

Example : String, WrapperClasses etc.
 */
import java.util.ArrayList;
import java.util.List;

final class MyImmutableClass{

     private final String name ;
     private final List<Object> petNameList;

     MyImmutableClass(String name, List<Object>petNameList){
         this.name = name;
         this.petNameList = petNameList;
     }

     public String getName(){
         return name;
     }

     public List<Object> getPetNameList(){
         return new ArrayList<>(petNameList);
         // return copy of member variable.
     }

}
public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");

        MyImmutableClass obj = new MyImmutableClass("Shri" , list);

        System.out.println(obj.getName());

        System.out.println(obj.getPetNameList());

         obj.getPetNameList().add("Hours");

        System.out.println(obj.getPetNameList());


    }


}
