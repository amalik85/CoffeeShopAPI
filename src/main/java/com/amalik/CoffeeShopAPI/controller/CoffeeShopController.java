package com.amalik.CoffeeShopAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeShopController {


        @RequestMapping("/hello")
        public String hello() {
            System.out.println("Hello....");
            return "Hello javaTpoint";
        }


}