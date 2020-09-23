package com.example.pipelinetestforjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello world 床前明月光aa啊啊啊啊";
    }
}
