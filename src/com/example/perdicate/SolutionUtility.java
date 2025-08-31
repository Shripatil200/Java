package com.example.perdicate;

import java.util.List;
import java.util.function.Predicate;

public class SolutionUtility
{

    // functions returns sum of numbers present in list based on user-defined test
    public static int add(List<Integer> nums, Predicate<Integer> select){
        int sum = 0;
        for(int num : nums){
            if(select.test(num)) {
                sum += num;
            }
        }
        return sum;
    }


    public static int addElements(List<Integer> nums, Predicate<Integer> select){
        return nums.stream().filter(select).mapToInt(Integer::intValue).sum();
    }

}
