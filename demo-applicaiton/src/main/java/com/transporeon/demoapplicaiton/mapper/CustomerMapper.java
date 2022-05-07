package com.transporeon.demoapplicaiton.mapper;

import com.transporeon.demoapplicaiton.model.dto.customer.CustomerDto;
import com.transporeon.demoapplicaiton.model.entity.customer.Address;
import com.transporeon.demoapplicaiton.model.entity.customer.Customer;
import com.transporeon.demoapplicaiton.model.request.UpsertCustomerRequest;

public class CustomerMapper {

    public static Customer map(final UpsertCustomerRequest request) {
        final Address address = new Address();
        address.setStreetAddress(request.getStreetAddress());
        address.setPostalCode(request.getPostalCode());
        address.setCityName(request.getCityName());
        address.setCountryName(request.getCountryName());

        final Customer customer = new Customer();
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setAddress(address);

        return customer;
    }

    public static CustomerDto map(final Customer customer) {
        final CustomerDto customerDto = new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setAddress(customer.getAddress());

        return customerDto;
    }
}
