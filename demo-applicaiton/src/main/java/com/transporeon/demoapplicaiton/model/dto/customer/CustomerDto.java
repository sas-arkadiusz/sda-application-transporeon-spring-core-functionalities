package com.transporeon.demoapplicaiton.model.dto.customer;

import com.transporeon.demoapplicaiton.model.entity.customer.Address;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class CustomerDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Address address;
}
