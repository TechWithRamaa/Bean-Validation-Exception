package com.engineeringwithramaa.beanvalidationandexceptionhandling.controller;


import com.engineeringwithramaa.beanvalidationandexceptionhandling.dto.UserRequest;
import com.engineeringwithramaa.beanvalidationandexceptionhandling.entity.User;
import com.engineeringwithramaa.beanvalidationandexceptionhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<User> saveUser(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
