package com.example.lms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition="TEXT")
    private String description;

    private Double price;

    private int duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="instructor_id")
    private Instructor instructor;
}

