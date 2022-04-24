package com.gucardev.springbootmicroservice1course.repository;

import com.gucardev.springbootmicroservice1course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {



}
