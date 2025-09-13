package com.example.generics.wildcards.types;

import com.example.generics.wildcards.Car;
import com.example.generics.wildcards.Suzuki;
import com.example.generics.wildcards.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class LoweBound {

    public static void main(String[] args) {
        Car car = new Car();
        Suzuki suzuki = new Suzuki();
        Vehicle vehicle = new Vehicle();


        Test test = new Test();


        List<Vehicle> vehiclesList = new ArrayList<>();
        vehiclesList.add(vehicle);
        vehiclesList.add(car);
        vehiclesList.add(suzuki);

        test.lowerBound(vehiclesList);





        List<Car> carList = new ArrayList<>();
//        carList.add(vehicle);  not allowed.    cant store parent object in child reference
        carList.add(car);
        carList.add(suzuki);


        test.lowerBound(carList);


        List<Suzuki> suzukiList = new ArrayList<>();
        vehiclesList.add(suzuki);

//        test.lowerBound(suzukiList);   // not allowed because of lowebound is applied on method...


         /*
        Problem :
            List<Vehicle> list = new ArrayList<>();
            List<Car> list2 = new ArrayList<>();
            list2 = list;                               // Not Allowed

            solution : use wildcard lower bound
         */


        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car());
        carsList.add(new Suzuki());

        List<Suzuki> suzukis = new ArrayList<>();
        suzukis.add(new Suzuki());

        List<Vehicle>  vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle());
        vehicleList.add(new Car());
        vehicleList.add(new Suzuki());


        List<? super Car> carsList1 = new ArrayList<>();
        carsList1 = vehiclesList;
        carsList1 = carsList;
//        carsList1 = suzukis;     Not Allowed

/*
        Vehicle obj2 = carsList1.get(0);  Not Allowed
        Car obj = carsList1.get(0);     Not allowed

*/



        Object obj1 = carsList1.get(0);    //Allowed




    }
}
