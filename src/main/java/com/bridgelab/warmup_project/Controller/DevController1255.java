package com.bridgelab.warmup_project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController1255 {
    @GetMapping("/1255")
    public String Greet() {
        return "Hello From Raunak";
    }
}
