package com.jpa.gymsystem.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Trainer")
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Email")
    private String email;

    //Relacionamentos
    @OneToMany(mappedBy = "trainer")
    private Set<WorkoutPlan> workoutPlans;
    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<WorkoutPlan> getWorkoutPlans() {
        return workoutPlans;
    }

    public void setWorkoutPlans(Set<WorkoutPlan> workoutPlans) {
        this.workoutPlans = workoutPlans;
    }
}
