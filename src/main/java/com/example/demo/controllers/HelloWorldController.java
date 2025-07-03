package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping
    public String hello(){
        System.out.println("Hello World!");
        return "Welcome to Spring-Boot Learning!";
    }
}