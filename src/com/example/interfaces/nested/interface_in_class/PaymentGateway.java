package com.example.interfaces.nested.interface_in_class;

public class PaymentGateway {

    public boolean verifyPayment(int amount){
        return amount > 0 && amount < 10000;
    }


    protected interface PaymentMethod{
        void pay(int amount);

        static boolean verify(int amount){
            return new PaymentGateway().verifyPayment(amount);
        }


    }

}
