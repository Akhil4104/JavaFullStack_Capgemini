package com.example.lms.service;

import com.example.lms.dto.CourseRequestDTO;
import com.example.lms.dto.CourseResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CourseService {
    CourseResponseDTO createCourse(CourseRequestDTO dto);

    CourseResponseDTO getCourse(Long id);

    Page<CourseResponseDTO> getAllCourses(Pageable pageable);

    CourseResponseDTO updateCourse(Long id,CourseRequestDTO dto);

    void deleteCourse(Long id);
}
