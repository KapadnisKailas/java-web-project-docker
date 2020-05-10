package com.example.javawebproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    
    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId){

        return "get user method called";

    }
}