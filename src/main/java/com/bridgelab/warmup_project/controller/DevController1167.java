package com.bridgelab.warmup_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DevController1167 {

    @GetMapping("/1167")
    public String getName() {
        return "Rishav Thakur";
    }
}
