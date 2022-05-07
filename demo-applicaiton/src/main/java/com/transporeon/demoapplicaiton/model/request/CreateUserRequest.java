package com.transporeon.demoapplicaiton.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateUserRequest {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
