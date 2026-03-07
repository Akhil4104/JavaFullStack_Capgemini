package com.example.cms.service;

import com.example.cms.dto.*;
import com.example.cms.entity.Course;
import com.example.cms.exception.ResourceNotFoundException;
import com.example.cms.repository.CourseRepository;
import com.example.cms.service.CourseService;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.*;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;
    private final ModelMapper mapper;

    @Override
    public CourseResponseDTO createCourse(CourseRequestDTO dto) {

        Course course = mapper.map(dto, Course.class);

        Course saved = repository.save(course);

        return mapper.map(saved, CourseResponseDTO.class);
    }

    @Override
    public CourseResponseDTO getCourseById(Long id) {

        Course course = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Course","id",id));

        return mapper.map(course, CourseResponseDTO.class);
    }

    @Override
    public Page<CourseResponseDTO> getAllCourses(int page,int size,String sortBy){

        Pageable pageable =
                PageRequest.of(page,size,Sort.by(sortBy));

        Page<Course> courses = repository.findAll(pageable);

        return courses.map(course ->
                mapper.map(course,CourseResponseDTO.class));
    }

    @Override
    public CourseResponseDTO updateCourse(Long id, CourseRequestDTO dto) {

        Course course = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Course","id",id));

        course.setTitle(dto.getTitle());
        course.setDescription(dto.getDescription());
        course.setInstructor(dto.getInstructor());
        course.setDuration(dto.getDuration());
        course.setPrice(dto.getPrice());

        Course updated = repository.save(course);

        return mapper.map(updated, CourseResponseDTO.class);
    }

    @Override
    public void deleteCourse(Long id) {

        Course course = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Course","id",id));

        repository.delete(course);
    }

    @Override
    public Page<CourseResponseDTO> searchCourses(String keyword,int page,int size){

        Pageable pageable = PageRequest.of(page,size);

        Page<Course> courses =
                repository.searchByTitle(keyword,pageable);

        return courses.map(c ->
                mapper.map(c,CourseResponseDTO.class));
    }

}