package com.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//teste com variavel de ambiente
@RestController

public class VariavelAmbiente {
    @Value("${teste.varivael.ambiente}")
    private String teste;

    @GetMapping("/teste/variavel-ambiente")
    public String variavelAmbiente() {
        return teste;
    }

}
