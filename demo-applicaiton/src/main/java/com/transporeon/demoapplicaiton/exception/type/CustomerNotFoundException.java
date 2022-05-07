package com.transporeon.demoapplicaiton.exception.type;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException() {
        super("Customer not found!");
    }
}
