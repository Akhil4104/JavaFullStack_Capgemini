package com.capgemini.SpringMvc.service;

import com.capgemini.SpringMvc.entity.Student;
import com.capgemini.SpringMvc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    
    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
    
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
    
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
