package com.example.singleton_class;

/*
👉 Efficient + Thread-safe.
❌ Different core of cpu can generate more than one instances.
 */
class DBConnectionDoubleCheck {
    private static volatile DBConnectionDoubleCheck instance;

    private DBConnectionDoubleCheck() {
        System.out.println("DB Connection created (Double-Checked Locking)");
    }

    public static DBConnectionDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DBConnectionDoubleCheck.class) {
                if (instance == null) {
                    instance = new DBConnectionDoubleCheck();
                }
            }
        }
        return instance;
    }
}

public class DoubleCheck_Locking {

    public static void main(String[] args) {
        DBConnectionDoubleCheck obj = DBConnectionDoubleCheck.getInstance();
    }
}
