package com.example.pipelinetestforjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello world 2020-09-23 16：24";
    }
}
