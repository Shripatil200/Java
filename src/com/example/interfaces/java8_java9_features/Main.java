package com.example.interfaces.java8_java9_features;

public class Main implements InterfaceMethods{


    @Override
    public void ValidateUser(String name, String password) {
        if(checkCredentials(name, password)){
            System.out.println("Valid User");
        }
        else {
            System.out.println("Invalid User");

        }

    }



    void lambdaExpression(){

        Printer printer = (String message)->{
            System.out.println(message);
        };

        printer.print("This text will be printed");
    }




    public static void main(String[] args) {
        Main obj = new Main();
        obj.ValidateUser("Shri", "ADMIN");

        obj.lambdaExpression();
    }

}
