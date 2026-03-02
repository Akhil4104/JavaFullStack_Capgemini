package com.capgemini.Spring.service;

import com.capgemini.Spring.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Override
    public Student save(Student student) {
        return student;
    }
}