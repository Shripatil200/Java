package com.example.enums.methods_variables;

public class Main {

    public static void main(String[] args) {
        EnumSample2 sample2 = EnumSample2.getEnumByValue(107);
        System.out.println(sample2.getComment());
    }
}
