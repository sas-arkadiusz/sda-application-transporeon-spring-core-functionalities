package com.transporeon.demoapplicaiton.controller;

import com.transporeon.demoapplicaiton.model.entity.User;
import com.transporeon.demoapplicaiton.model.entity.customer.Customer;
import com.transporeon.demoapplicaiton.model.request.CreateUserRequest;
import com.transporeon.demoapplicaiton.repository.CustomerRepository;
import com.transporeon.demoapplicaiton.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final CustomerRepository customerRepository;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid final CreateUserRequest request) {
        return ResponseEntity.ok(userService.createUser(request));
    }

    @GetMapping
    public List<User> getUsers() {
        Customer customer = new Customer();
        customer.setFirstName("ABC");
        customerRepository.save(customer);

        return userService.getUsers();
    }

}
