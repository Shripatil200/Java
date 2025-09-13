package com.example.singleton_class;

/*
👉 Instance created at class loading (even if unused).
✅ Simple, thread-safe by default.
❌ May waste resources if instance is never used.
 */

class DBConnectionEager {
    private static final DBConnectionEager instance = new DBConnectionEager();

    private DBConnectionEager() {
        System.out.println("DB Connection created (Eager)");
    }

    public static DBConnectionEager getInstance() {
        return instance;
    }
}


public class Eager_Initialization {

    public static void main(String[] args) {
        DBConnectionEager obj = DBConnectionEager.getInstance();
    }
}
