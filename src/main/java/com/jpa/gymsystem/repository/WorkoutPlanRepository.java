package com.jpa.gymsystem.repository;


import com.jpa.gymsystem.entity.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Integer> {
    WorkoutPlan findById(int id);
    WorkoutPlan findByName(String name);
}
