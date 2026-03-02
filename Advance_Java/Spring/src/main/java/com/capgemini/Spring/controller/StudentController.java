package com.capgemini.Spring.controller;

import com.capgemini.Spring.service.IStudentService;
import com.capgemini.Spring.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final IStudentService iStudentService;

    public StudentController(IStudentService iStudentService){
        this.iStudentService = iStudentService;
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return iStudentService.save(student);
    }
}