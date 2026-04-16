package com.webcourse.jpa.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//TABLEA INTERMEDIARIA
@Entity
@Table(name = "Enrolllment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int enrollment_id;

    @Column(name = "Enrollment_Date")
    private DateTimeFormat enrollmentDate;



    public int getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(int enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public DateTimeFormat getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(DateTimeFormat enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
