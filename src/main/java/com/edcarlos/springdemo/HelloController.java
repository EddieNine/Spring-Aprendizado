package com.edcarlos.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final SaudacaoService saudacaoService;

    // Injeção de Dependência via Construtor
    @Autowired
    public HelloController(SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        // Usando o serviço injetado para obter a saudação
        return saudacaoService.obterSaudacao(name);
    }
}
