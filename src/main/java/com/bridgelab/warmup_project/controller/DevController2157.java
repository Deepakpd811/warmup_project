package com.bridgelab.warmup_project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DevController2157 {

    @GetMapping("/2157")
    public String hello(){
        return "Hello from Himanshi";
    }
}
