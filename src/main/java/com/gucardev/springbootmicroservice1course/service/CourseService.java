package com.gucardev.springbootmicroservice1course.service;

import com.gucardev.springbootmicroservice1course.model.Course;
import com.gucardev.springbootmicroservice1course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course saveCourse(Course course) {
        course.setCreated(LocalDateTime.now());

        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

}
