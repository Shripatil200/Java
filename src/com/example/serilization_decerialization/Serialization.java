package com.example.serilization_decerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void serialize() {

        User user = new User("Shri","patilshriram200@gmail.com", "A1a1@@##",  25, new Address("India", "Maharashtra", "Pune", 411048));
        try {
            FileOutputStream fos = new FileOutputStream("op.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(user);

            System.out.println("object is written in file successfully");

        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }



}
