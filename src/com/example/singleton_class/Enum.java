package com.example.singleton_class;

/*
👉 Easiest + safest (handles serialization & reflection automatically).
👉 Enum ensures only one instance ever exists.

 */
enum DBConnectionEnum {
    INSTANCE;

    DBConnectionEnum() {
        System.out.println("DB Connection created (Enum)");
    }

    public void connect() {
        System.out.println("Connected to DB");
    }
}

public class Enum {

    public static void main(String[] args) {
        DBConnectionEnum instance = DBConnectionEnum.INSTANCE ;
    }
}
