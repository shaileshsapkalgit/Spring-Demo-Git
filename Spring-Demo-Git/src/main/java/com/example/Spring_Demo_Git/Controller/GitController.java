package com.example.Spring_Demo_Git.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
@GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
