package com.bridgelab.warmup_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class DevController0413 {

    @GetMapping
    public  String healthCheck(){
        return "Warm app project";
    }

    @GetMapping("/413")
    public String getName(){
        return "Deepak prasad ";
    }

    
}
