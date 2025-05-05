package com.edcarlos.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Olá, " + name + "!";
    }
}
