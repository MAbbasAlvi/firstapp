package com.abbas.firstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String sayHelloGet(){
        return "Hello World from Get Updated!";
    }

    @PostMapping("/")
    public String sayHelloPost(){
        return "Hello World from Post!";
    }

    @PutMapping("/")
    public String sayHelloPut(){
        return "Hello World from Put!";
    }

    @DeleteMapping("/")
    public String sayHelloDelete(){
        return "Hello World from Delete!";
    }
}
