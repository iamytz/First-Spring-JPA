package com.controllers;

import com.jpa.gymsystem.entity.Trainer;
import com.jpa.gymsystem.repository.TrainerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindTrainer {
    private TrainerRepository repository;

    //CRIACÃO METODO CONSTRUTOR
    public FindTrainer(TrainerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/Trainer/id/{id}")
    public Trainer findById(@PathVariable int id) {
        return repository.findById(id);
    }
}
