package com.example.interfaces.functional;



public class Main implements Predicate {
    @Override
    public boolean test(Object num){
        return Utility.isPrime((int) num);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        /*
        by overriding
         */
        System.out.println(obj.test(9));

        /*
        or method reference
         */
        Predicate<Integer> result  = Utility::isPrime;

        System.out.println(result.test(23));

        /*
        or lambda expression
         */
        Predicate<Integer> resultLambda  = (Integer val) ->{
            return Utility.isPrime(val);
        };
        System.out.println(resultLambda.test(22));
    }
}
