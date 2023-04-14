package com.example.sprintboot_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
    @RequestMapping("/hello")
    public String hello() {
        return "badc";
    }
}
