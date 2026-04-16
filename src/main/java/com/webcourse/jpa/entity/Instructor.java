package com.webcourse.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Instructor")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int instructor_id;

    @Column(name = "Name")
    private String instructor_name;

    @Column(name = "Email")
    private String getInstructor_email;

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public String getGetInstructor_email() {
        return getInstructor_email;
    }

    public void setGetInstructor_email(String getInstructor_email) {
        this.getInstructor_email = getInstructor_email;
    }
}
