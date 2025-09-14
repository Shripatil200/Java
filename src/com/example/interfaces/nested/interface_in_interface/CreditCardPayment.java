package com.example.interfaces.nested.interface_in_interface;

public class CreditCardPayment implements PaymentService, PaymentService.Validate{


    @Override
    public void pay(double amount) {
        if (validate(amount)) {
            System.out.println("Credit Card Payment of $"+amount+ " has been proceed");
        }
        else{
            System.out.println("Invalid amount, payment rejected..");
        }
    }

    @Override
    public boolean validate(double amount) {

        return amount > 0 && amount < 10000;
    }
}
