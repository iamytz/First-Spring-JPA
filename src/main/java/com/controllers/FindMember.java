package com.controllers;

import com.jpa.gymsystem.entity.Member;
import com.jpa.gymsystem.repository.MemberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class FindMember {
    private MemberRepository repository;

    public FindMember(MemberRepository repository) {
        this.repository = repository;   //cria um metodo construtor
    }




    //CRIANDO ROTA DINAMICA QUE RETORNA EM JSON, OS DADOS DE UM USUARIO
    @GetMapping("/member/name/{name}")
    public List<Member> findByName(@PathVariable String name) {
        return repository.findByName(name);
    }

    @GetMapping("/member/id/{id}")
    public Member findById(@PathVariable int id) {
        return repository.findById(id);
    }
}
