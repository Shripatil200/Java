package com.example.singleton_class;


class DBConnectionBillPugh {
    private DBConnectionBillPugh() {
        System.out.println("DB Connection created (Bill Pugh)");
    }

    private static class Helper {
        private static final DBConnectionBillPugh INSTANCE = new DBConnectionBillPugh();
    }

    public static DBConnectionBillPugh getInstance() {
        return Helper.INSTANCE;
    }
}


public class Bill_Pugh {

    public static void main(String[] args) {
        DBConnectionBillPugh obj = DBConnectionBillPugh.getInstance();
    }
}
