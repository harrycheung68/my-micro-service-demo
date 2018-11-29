package com.itmuch.cloud.controller;

import com.itmuch.cloud.pojo.User;
import com.itmuch.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User FindById(@PathVariable Long id) {
        return userService.findById(id);
    }
}
