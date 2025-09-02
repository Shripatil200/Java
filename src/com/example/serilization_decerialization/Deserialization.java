package com.example.serilization_decerialization;

import java.io.*;

public class Deserialization {

    Person person;
    public static void deserialize() {

        try {
            FileInputStream fis = new FileInputStream("op.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person = (Person) ois.readObject();
            System.out.println(person);


        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
