package com.capgemini.Spring.controller;

import com.capgemini.Spring.dto.ApiResponse;
import com.capgemini.Spring.dto.StudentRequestDto;
import com.capgemini.Spring.dto.StudentResponseDto;
import com.capgemini.Spring.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final IStudentService iStudentService;

    public StudentController(IStudentService iStudentService){
        this.iStudentService = iStudentService;
    }

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<StudentResponseDto>> saveStudent(
            @RequestBody StudentRequestDto requestDto) {

        StudentResponseDto dto = iStudentService.save(requestDto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ApiResponse<>(true, "Student Created", dto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<ApiResponse<List<StudentResponseDto>>> getAllStudents(){

        List<StudentResponseDto> studentList = iStudentService.findAll();

        ApiResponse<List<StudentResponseDto>> response =
                new ApiResponse<>(true, "Students fetched successfully", studentList);

        return ResponseEntity.ok(response);
    }
}