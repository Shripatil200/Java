package com.example.perdicate;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("All numbers addition:");
        System.out.println(SolutionUtility.add(List.of(1,2,3,4,5,6,7,8,9,10), TestCaseUtility::sumAll));
        System.out.println("Even numbers addition:");
        System.out.println(SolutionUtility.add(List.of(1,2,3,4,5,6,7,8,9,10), TestCaseUtility::isEven));
        System.out.println("Odd numbers addition:");
        System.out.println(SolutionUtility.add(List.of(1,2,3,4,5,6,7,8,9,10), TestCaseUtility::isOdd));
        System.out.println("Prime numbers addition:");
        System.out.println(SolutionUtility.add(List.of(1,2,3,4,5,6,7,8,9,10), TestCaseUtility::isPrime));
        System.out.println("PerfectSquare numbers addition:");
        System.out.println(SolutionUtility.add(List.of(1,2,3,4,5,6,7,8,9,10), TestCaseUtility::isPerfectSquare));
        System.out.println("Fibonacci numbers addition:");
        System.out.println(SolutionUtility.add(List.of(1,2,3,4,5,6,7,8,9,10), TestCaseUtility::isFibonacci));



        // Using stream
        System.out.println("All numbers addition:");
        System.out.println(SolutionUtility.addElements(List.of(1,2,3,4,5,6,7,8,9,10), TestCaseUtility::sumAll));
    }
}
