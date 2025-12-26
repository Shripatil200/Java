package com.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public void use_forName()  {
        try {
            Class<?> obj = Class.forName("com.example.reflection.Person");

            /*
            .getName()  : used to get full name of a class.
             */
            System.out.println("class name : "+obj.getName());
            /*
            .getMethods() used to get all method names as a list present in a class.
             */
            System.out.println("methods name :\n"+obj.getMethods());




            System.out.println("get single method:"+obj.getMethod("getName"));

            System.out.println(obj.getMethod("setName", String.class));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public void use_dot_class(){

        System.out.println("-------------------------------------------------------------------------------------------");
        Class<?> personClass = Person.class;

        /*
        Get constructor for initialise new object.
         */

        try {
            Constructor<?> personConstructor = personClass.getDeclaredConstructor(String.class, int.class);
            Object person = personConstructor.newInstance("alians", 25);

            System.out.println("Object created using .class referece\n person's name :" + ((Person) person).getName());

        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    public void use_getClass(){
        System.out.println("-------------------------------------------------------------------------------------------");

        /*
        accessing private fields
         */
        Person person  = new Person("Shri", 25);
        Class<?> personClass = person.getClass();
        try {
            Field nameField = personClass.getDeclaredField("name");
            nameField.setAccessible(true);
            System.out.println("Name of Person : "+(String) nameField.get(person));
            nameField.set(person, "Shriram");
            System.out.println("Name of Person : "+(String) nameField.get(person));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.use_forName();
        obj.use_dot_class();
        obj.use_getClass();
    }
}
