package com.example.interfaces.java8_java9_features;

public interface InterfaceMethods {

    /*
    Abstract method implementing class must implement this method...
     */
    void ValidateUser(String name, String password);

    /*
    default method (Java 8) :
        - used to create method that can have implementation.
        - can be overridden  by child class.
        - Used to avoid code duplication in multiple implementing classes.
        - can access Static , Static Private, other default, and private method.
     */
    default boolean checkCredentials(String userName, String password){
            if(checkIfValid(password) && checkIfValid(userName)){
                password = toLowerCase(password);
                return checkPassword(password);

            }
            return false;

    }

    /*
    static method (Java 8):
        - Unlike default methods static methods can not be overridden.
        - can be accessed from outside the interface.
        - can access only static and private static methods.
     */

    static String toLowerCase(String value){
        return value.toLowerCase();
    }

    /*
    private static method (Java 9):
        - can not be accessed outside the interface.
        - can access only static methods.
     */
    private static boolean checkIfValid(String value){
        return !value.isEmpty();
    }

    /*
     private methods (Java 9):
        - can access static and non-static methods of the interface.
        - can not be overridden outside because of private access modifier.
     */

    private boolean checkPassword(String password){
        return password.equals("admin");
    }


}
