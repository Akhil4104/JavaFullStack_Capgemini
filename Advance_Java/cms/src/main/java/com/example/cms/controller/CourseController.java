package com.example.cms.controller;

import com.example.cms.dto.*;
import com.example.cms.payload.ApiResponse;
import com.example.cms.service.CourseService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;

    @PostMapping
    public ResponseEntity<ApiResponse<CourseResponseDTO>> createCourse(
            @Valid @RequestBody CourseRequestDTO dto){

        CourseResponseDTO created = service.createCourse(dto);

        ApiResponse<CourseResponseDTO> response =
                new ApiResponse<>(true,"Course created successfully",created);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<CourseResponseDTO>> getCourse(@PathVariable Long id){

        CourseResponseDTO course = service.getCourseById(id);

        return ResponseEntity.ok(
                new ApiResponse<>(true,"Course fetched",course));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<Page<CourseResponseDTO>>> getAllCourses(

            @RequestParam(defaultValue="0") int page,
            @RequestParam(defaultValue="10") int size,
            @RequestParam(defaultValue="id") String sortBy){

        Page<CourseResponseDTO> courses =
                service.getAllCourses(page,size,sortBy);

        return ResponseEntity.ok(
                new ApiResponse<>(true,"Courses fetched",courses));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<CourseResponseDTO>> updateCourse(

            @PathVariable Long id,
            @Valid @RequestBody CourseRequestDTO dto){

        CourseResponseDTO updated =
                service.updateCourse(id,dto);

        return ResponseEntity.ok(
                new ApiResponse<>(true,"Course updated",updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteCourse(@PathVariable Long id){

        service.deleteCourse(id);

        return ResponseEntity.ok(
                new ApiResponse<>(true,"Course deleted",null));
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponse<Page<CourseResponseDTO>>> searchCourses(

            @RequestParam String keyword,
            @RequestParam(defaultValue="0") int page,
            @RequestParam(defaultValue="10") int size){

        Page<CourseResponseDTO> courses =
                service.searchCourses(keyword,page,size);

        return ResponseEntity.ok(
                new ApiResponse<>(true,"Search result",courses));
    }

}