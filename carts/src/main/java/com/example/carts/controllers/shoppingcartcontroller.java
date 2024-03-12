package com.example.carts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class shoppingcartcontroller {
 @GetMapping("/cart");
 public carts getsinglecart(){
      return  new carts();
    }
}



