package com.example.interfaces.nested.interface_in_interface;

public class UpiPayment implements PaymentService, PaymentService.Validate{
    @Override
    public void pay(double amount) {
        if(validate(amount)){
            System.out.println("UPI payment with amount $"+ amount+"has processed");
        }
        else{
            System.out.println("Invalid amount, payment failed");
        }
    }

    @Override
    public boolean validate(double amount) {
        return amount > 0 && amount < 20000;
    }
}
