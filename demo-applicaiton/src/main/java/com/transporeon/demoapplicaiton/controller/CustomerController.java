package com.transporeon.demoapplicaiton.controller;

import com.transporeon.demoapplicaiton.model.dto.customer.CustomerDto;
import com.transporeon.demoapplicaiton.model.request.UpsertCustomerRequest;
import com.transporeon.demoapplicaiton.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
@Validated
public class CustomerController {

    private final CustomerService customerService;

    // @PathVariable
    // @RequestParam
    // @RequestBody

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") @Range(min = 0) final Long customerId) {
        return ResponseEntity.ok(customerService.getCustomerById(customerId));
    }

    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody @Valid final UpsertCustomerRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.createCustomer(request));
    }

    @PutMapping
    public ResponseEntity<CustomerDto> updateCustomer(@RequestParam final Long customerId,
                                                      @RequestBody final UpsertCustomerRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.updateCustomer(customerId, request));
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("customerId") final Long customerId) {
        customerService.deleteCustomerById(customerId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
