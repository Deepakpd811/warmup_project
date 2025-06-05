package com.bridgelab.warmup_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dev_0463Controller {
    @GetMapping("/dev_0463")
    public String getHello(){
        return "Hello from divyam";
    }
}
