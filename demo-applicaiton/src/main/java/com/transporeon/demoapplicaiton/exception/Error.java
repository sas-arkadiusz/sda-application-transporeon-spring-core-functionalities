package com.transporeon.demoapplicaiton.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Error {
    private final String message;
}
