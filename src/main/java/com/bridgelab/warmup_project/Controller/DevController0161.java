package com.bridgelab.warmup_project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DevController0161 {
    @GetMapping("0161")
    public String test0161() {
        return "Hello World!";
    }
}
