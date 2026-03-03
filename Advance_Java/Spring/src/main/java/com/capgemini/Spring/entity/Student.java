package com.capgemini.Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity                     // 🔥 VERY IMPORTANT
@Table(name = "students")   // optional but recommended
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}