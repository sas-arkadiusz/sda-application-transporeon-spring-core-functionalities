package com.transporeon.demoapplicaiton.model.request;

import com.transporeon.demoapplicaiton.constraints.PostalCode;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UpsertCustomerRequest {

    @NotNull
    private final String firstName;

    @NotNull
    private final String lastName;

    @NotNull
    @Size(min = 10, message = "Street address is too short!")
    private final String streetAddress;

    @PostalCode
    private final String postalCode;

    private final String cityName;

    private final String countryName;
}
