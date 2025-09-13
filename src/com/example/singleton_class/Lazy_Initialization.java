package com.example.singleton_class;


/*
👉 Instance created only when requested.
❌ Not thread-safe in multi-threaded apps.
 */
class DBConnectionLazy {
    private static DBConnectionLazy instance;

    private DBConnectionLazy() {
        System.out.println("DB Connection created (Lazy)");
    }

    public static DBConnectionLazy getInstance() {
        if (instance == null) {
            instance = new DBConnectionLazy();
        }
        return instance;
    }
}

public class Lazy_Initialization {

    public static void main(String[] args) {

        DBConnectionLazy obj = DBConnectionLazy.getInstance();
    }
}
