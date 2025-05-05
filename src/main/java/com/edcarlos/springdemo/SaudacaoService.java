package com.edcarlos.springdemo;

import org.springframework.stereotype.Service;

@Service
public class SaudacaoService {

    public String obterSaudacao(String nome) {
        return "Olá, " + nome + "!";
    }
}
