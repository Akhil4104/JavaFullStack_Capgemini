package com.capgemini.Spring.repository;

import com.capgemini.Spring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}