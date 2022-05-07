package com.transporeon.demoapplicaiton.model.dto.customer;

import com.transporeon.demoapplicaiton.model.entity.customer.Address;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@Builder
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerDto {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final Address address;
}
