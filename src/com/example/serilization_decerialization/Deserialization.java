package com.example.serilization_decerialization;

import java.io.*;

public class Deserialization {

    User user;
    public static void deserialize() {

        try {
            FileInputStream fis = new FileInputStream("op.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            System.out.println(user);


        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
