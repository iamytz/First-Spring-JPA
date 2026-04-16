package com.webcourse.jpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Course_Details")
public class Course_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_details_id;

    @Column(name = "description")
    private String description;

    @Column(name = "Duration")
    private float duration;

    //CRIANDO RELACIONAMENTOS
    @OneToOne(mappedBy = "course")
    private Course course;

    public int getCourse_details_id() {
        return course_details_id;
    }

    public void setCourse_details_id(int course_details_id) {
        this.course_details_id = course_details_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
