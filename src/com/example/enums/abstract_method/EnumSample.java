package com.example.enums.abstract_method;

public enum EnumSample {

    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("Monday");
        }
    },
    TUESDAY {
        @Override
        public void dummyMethod() {
            System.out.println("Tuesday");
        }
    },
    SUNDAY {
        @Override
        public void dummyMethod() {
            System.out.println("Sunday");
        }
    };


    public abstract  void dummyMethod();
}
