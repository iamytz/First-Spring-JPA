package com.jpa.gymsystem.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "Workout_Details")
public class WorkoutDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "Description")
    private String description; //descrição do treino

    @Getter
    @Setter
    @Column(name = "MuscularGroup")
    private String muscularGroup;   //grupo muscular

    @Getter
    @Setter
    @Column(name = "Duration")
    private int duration;   //duração do treino

    @Getter
    @Setter
    @Column(name = "Reps")
    private int reps;   //qtd repetições

    @Getter
    @Setter
    @Column (name = "Heigth")
    private int heigth; //qtd carga

    //RELACIONAMENTOS
    @Getter
    @Setter
    @OneToOne(mappedBy = "workoutDetails")
    private WorkoutPlan workoutPlan;

}
