package com.example.cms.repository;

import com.example.cms.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

public interface CourseRepository extends JpaRepository<Course,Long> {
    @Query("Select c From Course c where Lower(c.title) Like Lower(Concat('%',:kw,'%'))")
    Page<Course> searchByTitle(@Param("kw")String keyword, Pageable pageable);
}
