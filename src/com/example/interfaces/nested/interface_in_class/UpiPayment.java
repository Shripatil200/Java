package com.example.interfaces.nested.interface_in_class;

public class UpiPayment implements PaymentGateway.PaymentMethod {
    @Override
    public void pay(int amount) {
        if(PaymentGateway.PaymentMethod.verify(amount)){
            System.out.println("Payment done by UPI...");
        }else{
            System.out.println("Payment failed...");
        }
    }
}
