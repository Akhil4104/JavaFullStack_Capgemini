package com.capgemini.Spring.service;

import com.capgemini.Spring.dto.StudentRequestDto;
import com.capgemini.Spring.dto.StudentResponseDto;
import com.capgemini.Spring.entity.Student;
import com.capgemini.Spring.exception.StudentNotFoundException;
import com.capgemini.Spring.repository.IStudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepo studentRepository;

    public StudentServiceImpl(IStudentRepo studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentResponseDto save(StudentRequestDto requestDto) {

        Student student = new Student();
        student.setName(requestDto.getName());

        // 🔥 Save in DB
        Student savedStudent = studentRepository.save(student);

        return new StudentResponseDto(
                savedStudent.getId(),
                savedStudent.getName()
        );
    }

    @Override
    public List<StudentResponseDto> findAll() {

        List<Student> students = studentRepository.findAll();

        return students.stream()
                .map(student -> new StudentResponseDto(
                        student.getId(),
                        student.getName()
                ))
                .collect(Collectors.toList());
    }
}