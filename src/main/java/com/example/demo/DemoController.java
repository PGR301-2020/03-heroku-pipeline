package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/pong")
    public String ping() {
        return "ping";
    }

    @GetMapping(path = "/ping")
    public String pong() {
        return "pong";
    }

}


