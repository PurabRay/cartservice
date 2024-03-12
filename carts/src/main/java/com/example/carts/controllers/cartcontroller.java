package com.example.carts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cartcontroller {
    @GetMapping("/addToCart/{id}");
    private cartservice cartservice;
    public void addToCart(@PathVariable(name="id") Long id){

    }
}
