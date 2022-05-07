package com.transporeon.demoapplicaiton.exception.handler;

import com.transporeon.demoapplicaiton.exception.Error;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class MethodArgumentNotValidExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Error handleMethodArgumentNotValidException(final MethodArgumentNotValidException exception) {

        final StringBuilder errorMessage = new StringBuilder();
        final List<FieldError> errors = exception.getBindingResult().getFieldErrors();

        for (FieldError fieldError : errors) {
            errorMessage.append(fieldError.getDefaultMessage() + ". ");
        }

        return new Error(errorMessage.toString());
    }
}
