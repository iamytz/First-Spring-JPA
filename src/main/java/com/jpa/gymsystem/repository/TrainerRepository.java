package com.jpa.gymsystem.repository;


import com.jpa.gymsystem.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository  extends JpaRepository<Trainer, Integer> {
    Trainer findById(int id);
}
