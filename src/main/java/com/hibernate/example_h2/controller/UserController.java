package com.hibernate.example_h2.controller;

import com.hibernate.example_h2.dto.UserDTO;
import com.hibernate.example_h2.entity.User;
import com.hibernate.example_h2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @GetMapping()
    public List<User> getUser() {
        return userService.getUserList();
    }
}

