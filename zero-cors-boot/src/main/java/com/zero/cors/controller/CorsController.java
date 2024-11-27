package com.zero.cors.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

    //@CrossOrigin
    @GetMapping("/hello")
    public String hello() {
        System.out.println("get hello");
        return "get hello";
    }

    @CrossOrigin
    @PostMapping("/hello")
    public String hello2() {
        System.out.println("post hello");
        return "post hello";
    }

}