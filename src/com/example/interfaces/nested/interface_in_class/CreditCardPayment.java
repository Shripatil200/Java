package com.example.interfaces.nested.interface_in_class;

public class CreditCardPayment implements PaymentGateway.PaymentMethod{
    @Override
    public void pay(int amount) {
        if(PaymentGateway.PaymentMethod.verify(amount)){
            System.out.println("Payment done by card...");
        }else{
            System.out.println("Payment failed...");
        }
    }
}
