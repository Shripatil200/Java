package com.example.singleton_class;

/*
👉 Thread-safe but slower (synchronization on every call).
 */

class DBConnectionSync {
    private static DBConnectionSync instance;

    private DBConnectionSync() {
        System.out.println("DB Connection created (Synchronized Method)");
    }

    public static synchronized DBConnectionSync getInstance() {
        if (instance == null) {
            instance = new DBConnectionSync();
        }
        return instance;
    }
}


public class Synchronized_Method {

    public static void main(String[] args) {

        DBConnectionSync obj = DBConnectionSync.getInstance();
    }
}
