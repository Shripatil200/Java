package com.example.generics.bounded.multi_bounds;



import java.util.*;
import java.util.function.Predicate;


class Demo1 extends ArrayList implements Predicate {

    @Override
    public boolean test(Object o) {
        return false;
    }
}


class Demo2 extends Thread implements  Predicate{


    @Override
    public boolean test(Object o) {
        return false;
    }
}



class Test <T extends  Runnable & Predicate>{
    void  print(){
        System.out.println("hello");
    }

}


public class Main {

    public static void main(String[] args) {
//        Test<Demo1> demo = new Test<>();   // Not allowed because Demo didn't implemented Runnable
        Test<Demo2> test = new Test<>();

        test.print();

    }
}
