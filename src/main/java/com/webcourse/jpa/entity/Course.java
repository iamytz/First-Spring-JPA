package com.webcourse.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_id;

    @Column(name = "Name", nullable = false)
    private String course_name;

    @Column(name = "Price",nullable = false)
    private float price;

    //CRIANDO RELACIONAMENTOS
    @OneToOne
    @JoinColumn(name = "course_id")
    private Course_Details course;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
