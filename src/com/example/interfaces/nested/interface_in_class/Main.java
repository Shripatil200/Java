package com.example.interfaces.nested.interface_in_class;

public class Main {
    public static void main(String[] args) {
        PaymentGateway.PaymentMethod payment = new CreditCardPayment();
        payment.pay(3000);
    }
}
