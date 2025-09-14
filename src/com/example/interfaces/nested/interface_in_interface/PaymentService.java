package com.example.interfaces.nested.interface_in_interface;

public interface PaymentService {
    void pay(double amount);


    /*
    Inner interface of interface must be always public.
    we can create inner interface reference using parent_name.child_name
    ex: PaymentService.Validate
     */
    public interface Validate{
        boolean validate(double amount);
    }

}
