package com.example.records;

public class Main
{

    public static void main(String[] args) {
        User user = new User("Shriram", 25, "pune");

        System.out.println("Name :" + user.name());
        System.out.println("Age :" + user.age());
        System.out.println("city :"+ user.city());
        System.out.println(user);

    }


}


record User(String name, int age, String city){}
