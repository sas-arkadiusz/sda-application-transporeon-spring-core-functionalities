package com.transporeon.demoapplicaiton.service;

import com.transporeon.demoapplicaiton.mapper.CustomerMapper;
import com.transporeon.demoapplicaiton.model.dto.customer.CustomerDto;
import com.transporeon.demoapplicaiton.model.entity.customer.Customer;
import com.transporeon.demoapplicaiton.model.request.UpsertCustomerRequest;
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

    public CustomerDto createCustomer(final UpsertCustomerRequest request) {
        final Customer customerFromRequest = CustomerMapper.map(request);
        addressRepository.save(customerFromRequest.getAddress());
        final Customer createdCustomer = customerRepository.save(customerFromRequest);

        return CustomerMapper.map(createdCustomer);
    }

    public CustomerDto updateCustomer(final Long customerId, final UpsertCustomerRequest request) {
        final Customer customerFromDatabase = getCustomerFromDatabaseById(customerId);
        final Customer customerFromRequest = CustomerMapper.map(request);
        customerFromRequest.setId(customerId);

        customerFromRequest.getAddress().setId(customerFromDatabase.getAddress().getId());
        addressRepository.save(customerFromRequest.getAddress());

        return CustomerMapper.map(customerRepository.save(customerFromRequest));
    }

    public void deleteCustomerById(final Long customerId) {
        customerRepository.delete(getCustomerFromDatabaseById(customerId));
    }

    public CustomerDto getCustomerById(final Long customerId) {
        return CustomerMapper.map(getCustomerFromDatabaseById(customerId));
    }

    private Customer getCustomerFromDatabaseById(final Long customerId) {
        final Optional<Customer> customerFromDatabase = customerRepository.findById(customerId);
        return customerFromDatabase.orElseThrow(RuntimeException::new);

        /*
            if (customerFromDatabase.isPresent()) {
                return CustomerMapper.map(customerFromDatabase.get());
            }
            throw new RuntimeException();
        */
    }
}
