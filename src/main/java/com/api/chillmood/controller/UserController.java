package com.api.chillmood.controller;

import com.api.chillmood.dto.UserDto;
import com.api.chillmood.entity.User;
import com.api.chillmood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    //test comment
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
    public User createUser(@RequestBody UserDto newUser) {
        return userService.createUser(newUser);
    }


}
