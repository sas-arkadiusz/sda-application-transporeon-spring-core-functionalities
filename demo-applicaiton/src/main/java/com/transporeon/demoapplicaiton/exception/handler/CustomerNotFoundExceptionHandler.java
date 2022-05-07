package com.transporeon.demoapplicaiton.exception.handler;

import com.transporeon.demoapplicaiton.exception.Error;
import com.transporeon.demoapplicaiton.exception.type.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerNotFoundExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CustomerNotFoundException.class)
    public Error handleCustomerNotFoundException(final CustomerNotFoundException exception) {
        return new Error(exception.getMessage());
    }
}
