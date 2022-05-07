package com.transporeon.demoapplicaiton.service;

import com.transporeon.demoapplicaiton.mapper.CustomerMapper;
import com.transporeon.demoapplicaiton.model.dto.customer.CustomerDto;
import com.transporeon.demoapplicaiton.model.entity.customer.Address;
import com.transporeon.demoapplicaiton.model.entity.customer.Customer;
import com.transporeon.demoapplicaiton.model.request.CreateCustomerRequest;
import com.transporeon.demoapplicaiton.repository.AddressRepository;
import com.transporeon.demoapplicaiton.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final AddressRepository addressRepository;
    private final CustomerRepository customerRepository;

    public CustomerDto createCustomer(final CreateCustomerRequest request) {
        final Customer customerFromRequest = CustomerMapper.map(request);
        addressRepository.save(customerFromRequest.getAddress());
        final Customer createdCustomer = customerRepository.save(customerFromRequest);

        return CustomerMapper.map(createdCustomer);
    }

    public CustomerDto getCustomerById(final Long customerId) {
        final Optional<Customer> customerFromDatabase = customerRepository.findById(customerId);

        /*
            if (customerFromDatabase.isPresent()) {
                return CustomerMapper.map(customerFromDatabase.get());
            }
            throw new RuntimeException();
        */

        return customerFromDatabase.map(CustomerMapper::map)
                .orElseThrow(RuntimeException::new);
    }
}
