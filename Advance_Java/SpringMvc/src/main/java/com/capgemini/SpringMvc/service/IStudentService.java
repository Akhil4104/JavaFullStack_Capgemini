package com.capgemini.SpringMvc.service;

import com.capgemini.SpringMvc.entity.Student;
import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Optional<Student> getStudentById(Long id);
    void deleteStudent(Long id);
    Student updateStudent(Student student);
}
