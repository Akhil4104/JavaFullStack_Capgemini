package com.capgemini.SpringMvc.controller;

import com.capgemini.SpringMvc.entity.Student;
import com.capgemini.SpringMvc.service.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private IStudentService studentService;
    
    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "student";
    }
    
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add_Student";
    }
    
    @PostMapping("/save")
    public String saveStudent(@Valid @ModelAttribute("student") Student student, 
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add_Student";
        }
        studentService.saveStudent(student);
        return "redirect:/students";
    }
    
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student student = studentService.getStudentById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("student", student);
        return "add_Student";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
