package com.example.annotations.use_annotaion;

import com.example.annotations.customannotaion.ExecutionNTimes;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        MessageService service = new MessageService();

        Class<?> serviceClass = service.getClass();

        try {
            Method  method = serviceClass.getMethod("displayMessage");

            if(method.isAnnotationPresent(ExecutionNTimes.class)){
                ExecutionNTimes annotation = method.getAnnotation(ExecutionNTimes.class);
                int value = annotation.value();


                for(int i =0; i < value; i++){
                    service.displayMessage();
                }
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
