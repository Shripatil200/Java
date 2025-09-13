package com.example.generics.wildcards.types;

import com.example.generics.wildcards.Car;
import com.example.generics.wildcards.Suzuki;
import com.example.generics.wildcards.types.Test;
import com.example.generics.wildcards.Vehicle;

import java.util.ArrayList;
import java.util.List;

//class Test<? extends Vehicle>{
//      Wild card can't be used in class level, classes only allows parameter generic
//}


//class GenericClass<T>{
//    private T ob;
//    void print(T ob){ }
//
//}


public class UpperBound {

//    void display(List<? extends Car> car){}


    public static void main(String[] args) {
        Test test = new Test();
        Vehicle vehicle = new Vehicle();
        Car car  = new Car();
        Suzuki suzuki = new Suzuki();


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle);
        vehicles.add(car);
        vehicles.add(suzuki);

/*
         test.upperBound(vehicles);    // Not allowed because of upperbound is applied on method
*/

        List<Car> listCar = new ArrayList<>();
//        listCar.add(vehicle);   //not allowed because child class reference can't store parent object..
        listCar.add(car);
        listCar.add(suzuki);

        test.upperBound(listCar);  // accepts list of Car and its child classes


        List<Suzuki> suzukiList  = new ArrayList<>();

        /*
        suzukiList.add(vehicle);
        suzukiList.add(car);

        Not Allowed because child reference can't have parent class object
         */
        suzukiList.add(suzuki);

        test.upperBound(suzukiList);   // accepts list of Car and its child classes and suzuki is child of Car..



        /*
        Problem :
            List<Vehicle> list = new ArrayList<>();
            List<Car> list2 = new ArrayList<>();
            list = list2;                               // Not Allowed

            solution : use wildcard upper bound
         */



        List<Car> carList = new ArrayList<>();
        carList.add(new Car());
        carList.add(new Suzuki());

        List<Suzuki> suzukis = new ArrayList<>();
        suzukis.add(new Suzuki());

        List<Vehicle>  vehiclesList = new ArrayList<>();
        vehiclesList.add(new Vehicle());
        vehiclesList.add(new Car());
        vehiclesList.add(new Suzuki());


        List<? extends Car> carsList = new ArrayList<>();

        carsList = carList;
        carsList = suzukis;


        //        carsList = vehiclesList;  Not Allowed - upper bound is set to Car

        Car carObj = carsList.get(0);    // Now we are garented that we will always get car object

//        Suzuki suzukiObj = carsList.get(0);   // Not allowed in future we could add Mahindra in car











    }


}
