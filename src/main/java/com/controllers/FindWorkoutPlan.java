package com.controllers;

import com.jpa.gymsystem.entity.WorkoutPlan;
import com.jpa.gymsystem.repository.WorkoutPlanRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindWorkoutPlan {
    //objeto da interface repositorio
    private WorkoutPlanRepository repository;

    public FindWorkoutPlan(WorkoutPlanRepository repository){
        this.repository = repository;
    }
    @GetMapping("/workoutplan/id/{id}")
    //
    public WorkoutPlan findById(@PathVariable int id) {
        return repository.findById(id);
    }
    @GetMapping("/workoutplan/name/{name}")
    public WorkoutPlan findByName(@PathVariable String name) {
        return  repository.findByName(name);
    }

}
