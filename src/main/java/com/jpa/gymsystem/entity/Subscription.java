package com.jpa.gymsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Subscripton")
public class Subscription {

    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //RELACIONAMENTOS DA CLASSE INTERMEDIARIA
    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "memberID")
    private Member member;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "WorkoutID")
    private WorkoutPlan workoutPlan;


}
