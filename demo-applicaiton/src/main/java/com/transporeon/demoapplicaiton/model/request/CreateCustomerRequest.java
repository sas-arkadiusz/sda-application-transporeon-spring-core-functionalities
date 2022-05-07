package com.transporeon.demoapplicaiton.model.request;

import lombok.Data;

@Data
public class CreateCustomerRequest {
    private final String firstName;
    private final String lastName;
    private final String streetAddress;
    private final String postalCode;
    private final String cityName;
    private final String countryName;
}
