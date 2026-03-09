package com.example.lms.controller;

import com.example.lms.dto.CourseRequestDTO;
import com.example.lms.dto.CourseResponseDTO;
import com.example.lms.payload.ApiResponse;
import com.example.lms.service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<ApiResponse<CourseResponseDTO>> createCourse(
            @Valid @RequestBody CourseRequestDTO dto){

        CourseResponseDTO created = courseService.createCourse(dto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(true,"Course created",created));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<CourseResponseDTO>> getCourse(@PathVariable Long id){

        CourseResponseDTO course = courseService.getCourse(id);

        return ResponseEntity.ok(new ApiResponse<>(true,"Course fetched",course));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<Page<CourseResponseDTO>>> getAllCourses(

            @RequestParam(defaultValue="0") int page,
            @RequestParam(defaultValue="10") int size,
            @RequestParam(defaultValue="title") String sortBy){

        Pageable pageable = PageRequest.of(page,size, Sort.by(sortBy));

        Page<CourseResponseDTO> courses = courseService.getAllCourses(pageable);

        return ResponseEntity.ok(new ApiResponse<>(true,"Courses fetched",courses));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<CourseResponseDTO>> updateCourse(
            @PathVariable Long id,
            @Valid @RequestBody CourseRequestDTO dto){

        CourseResponseDTO updated = courseService.updateCourse(id,dto);

        return ResponseEntity.ok(new ApiResponse<>(true,"Course updated",updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> deleteCourse(@PathVariable Long id){

        courseService.deleteCourse(id);

        return ResponseEntity.ok(new ApiResponse<>(true,"Course deleted",null));
    }
}