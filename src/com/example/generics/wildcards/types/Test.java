package com.example.generics.wildcards.types;

import com.example.generics.wildcards.Car;
import com.example.generics.wildcards.Vehicle;

import java.util.List;

class Test {

    //function(Generic class<? extends Class> bje);
    void upperBound(List<? extends Car> obj) {
        System.out.println(obj.toString());
    }

    void lowerBound(List<? super Car> obj){
        System.out.println(obj.toString());

    }

     void  display(List<? extends Vehicle> vehicalList){
         System.out.println(vehicalList.toString());
    }



}
