package com.natwest.springdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorkdCController {
    @GetMapping("/d1")
    public String displayMsg1(){
        return "this is spring demo1";
    }
    @GetMapping("/d2")
    public String displayMsg2(){
        return "This is spring demo2";
    }
}
