package com.example.UserService.controller;

import com.example.UserService.model.User;
import com.example.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> findAllUser(){
        return this.userService.findAllUser();
    }
    @GetMapping("/{userId}")
    public User findUserByUserId(@PathVariable("userId")String userId){
        return  this.userService.findUserByUserId(userId);
    }
    @PostMapping
    public User addUser(@RequestBody User User){
        return this.userService.addUser(User);
    }




}
