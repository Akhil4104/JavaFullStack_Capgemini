package com.capgemini.Spring.service;

import com.capgemini.Spring.dto.StudentRequestDto;
import com.capgemini.Spring.dto.StudentResponseDto;

import java.util.List;

public interface IStudentService {

    StudentResponseDto save(StudentRequestDto studentRequestDto);

    List<StudentResponseDto> findAll();
}