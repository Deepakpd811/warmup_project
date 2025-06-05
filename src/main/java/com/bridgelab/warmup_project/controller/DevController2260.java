package com.bridgelab.warmup_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DevController2260 {

    @GetMapping("/Vanshika")
    public String getGreeting() {
        return "Hello from Vanshika";
    }
}
