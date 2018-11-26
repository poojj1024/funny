package com.poojj.funny.controller;

import com.poojj.funny.entity.User;
import com.poojj.funny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    public String addUser(User user){
        String message = userService.addUser(user);
        return message;
    }

    @RequestMapping("/login")
    public String login(User user){
        String message = userService.login(user);
        return message;
    }
}
