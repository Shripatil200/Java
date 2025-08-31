package com.example.perdicate;

public class TestCaseUtility {

    // Test that always return true
    public static boolean sumAll(int num){
        return true;
    }

    // Test that returns true for even numbers otherwise false
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    // Test that returns true for odd numbers otherwise false
    public static boolean isOdd(int num){
        return !isEven(num);
    }

    // Test that returns true for prime numbers otherwise false
    public static boolean isPrime(int num) {
        if (num <= 1) return false;       // 0, 1, and negatives are not prime
        if (num == 2) return true;        // 2 is the only even prime
        if (num % 2 == 0) return false;   // eliminate even numbers > 2

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }


    // Test that returns true if number is perfect square otherwise false
    public static boolean isPerfectSquare(int num) {
        if (num < 1) return false;  // 0 and negatives are not perfect squares
        if (num == 1) return true;

        int low = 1, high = num;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midSquare = (long) mid * mid;  // prevent overflow

            if (midSquare == num) return true;
            if (midSquare < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }


    // Test that return true is number is part of fibonacci series otherwise false
    public static boolean isFibonacci(int num){
        return isPerfectSquare(5*num*num+4) || isPerfectSquare(5*num*num-4);
    }





}
