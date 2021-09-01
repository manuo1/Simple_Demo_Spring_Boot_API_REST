package com.manuo1.user_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manuo1.user_api.model.AppUser;
import com.manuo1.user_api.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
    * Read - Get all users
    * @return - An Iterable object of User full filled
    */
    @GetMapping("/all")
    public Iterable<AppUser> getEmployees() {
        return userService.getAllUsers();
    }
	
}
