package com.example.lms.service;

import com.example.lms.dto.CourseRequestDTO;
import com.example.lms.dto.CourseResponseDTO;
import com.example.lms.entity.Course;
import com.example.lms.entity.Instructor;
import com.example.lms.exception.ResourceNotFoundException;
import com.example.lms.repository.CourseRepository;
import com.example.lms.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;
    private final ModelMapper mapper;

    @Override
    public CourseResponseDTO createCourse(CourseRequestDTO dto) {

        Instructor instructor = instructorRepository.findById(dto.getInstructorId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Instructor","id",dto.getInstructorId()));

        Course course = mapper.map(dto,Course.class);

        course.setInstructor(instructor);

        Course saved = courseRepository.save(course);

        CourseResponseDTO response = mapper.map(saved,CourseResponseDTO.class);

        response.setInstructor(saved.getInstructor().getName());

        return response;
    }

    @Override
    public CourseResponseDTO getCourse(Long id) {

        Course course = courseRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Course","id",id));

        CourseResponseDTO response = mapper.map(course,CourseResponseDTO.class);

        response.setInstructor(course.getInstructor().getName());

        return response;
    }

    @Override
    public Page<CourseResponseDTO> getAllCourses(Pageable pageable) {

        Page<Course> courses = courseRepository.findAll(pageable);

        return courses.map(course -> {

            CourseResponseDTO dto = mapper.map(course,CourseResponseDTO.class);

            dto.setInstructor(course.getInstructor().getName());

            return dto;
        });
    }

    @Override
    public CourseResponseDTO updateCourse(Long id,CourseRequestDTO dto) {

        Course course = courseRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Course","id",id));

        mapper.map(dto,course);

        Course updated = courseRepository.save(course);

        CourseResponseDTO response = mapper.map(updated,CourseResponseDTO.class);

        response.setInstructor(updated.getInstructor().getName());

        return response;
    }

    @Override
    public void deleteCourse(Long id) {

        Course course = courseRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Course","id",id));

        courseRepository.delete(course);
    }
}