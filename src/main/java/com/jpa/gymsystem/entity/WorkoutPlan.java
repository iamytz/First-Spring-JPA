package com.jpa.gymsystem.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Workout_Plan")
public class    WorkoutPlan {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Getter
    @Setter
    @Column(name = "Name")
    private String name;

    //RELACIONAMENTOS
    @Getter
    @Setter
    @OneToMany(mappedBy = "workoutPlan")
    private Set <Subscription> subscriptions;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "DetailsID")
    private WorkoutDetails workoutDetails;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "trainerID")
    private Trainer trainer;


}
