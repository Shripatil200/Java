package com.example.annotations.use_annotaion;

import com.example.annotations.customannotaion.ExecutionNTimes;

public class MessageService {

    @ExecutionNTimes(3)
    public void displayMessage(){
        System.out.println("This is messaging service");
    }
}
