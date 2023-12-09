package com.api.chillmood.controller;

import com.api.chillmood.dto.UserDTO;
import com.api.chillmood.entity.User;
import com.api.chillmood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public User getUser(@RequestParam(required = false) String name) {
        return userService.getUserByName(name);
    }

    @PostMapping
    public User createUser(@RequestBody UserDTO newUser) {
        return userService.createUser(newUser);
    }



}
