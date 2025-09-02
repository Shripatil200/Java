package com.example.serilization_decerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void serialize() {

        Person person = new Person("Shri",  25, new Address("India", "Maharashtra", "Pune", 411048));
        try {
            FileOutputStream fos = new FileOutputStream("op.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);

            System.out.println("object is written in file successfully");

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }



}
