package com.vinay.testazurevinay.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class HelloController {
    @Autowired
    @CrossOrigin
    @PreAuthorize("hasRole('Users')")
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}