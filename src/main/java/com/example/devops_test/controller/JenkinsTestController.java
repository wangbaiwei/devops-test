package com.example.devops_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

    @GetMapping("test")
    public String test() {
        return "Hello Jenkins!";
    }
}
