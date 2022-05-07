package com.transporeon.demoapplicaiton.controller;

import com.transporeon.demoapplicaiton.model.entity.User;
import com.transporeon.demoapplicaiton.model.request.CreateUserRequest;
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

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody @Valid final CreateUserRequest request) {
        return ResponseEntity.ok(userService.createUser(request));
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
