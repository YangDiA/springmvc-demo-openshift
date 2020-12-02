package com.example.openshift.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String hello(){
        System.out.println("hello word");
        return "hello word";
    }
}
