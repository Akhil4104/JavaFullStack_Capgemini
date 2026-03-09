package com.example.lms.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="instructors")
public class Instructor{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique=true)
    private String email;

    private String expertise;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="profile_id")
    private InstructorProfile profile;

    @OneToMany(mappedBy="instructor",cascade=CascadeType.ALL)
    private List<Course>courses=new ArrayList<>();
}
