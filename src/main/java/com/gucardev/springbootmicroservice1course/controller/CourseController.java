package com.gucardev.springbootmicroservice1course.controller;

import com.gucardev.springbootmicroservice1course.model.Course;
import com.gucardev.springbootmicroservice1course.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private final CourseService courseService;


    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping //api/course
    public ResponseEntity<?> saveCourse(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    @DeleteMapping("{courseId}")//api/course/{courseId}
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId) {
        courseService.deleteCourse(courseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/course
    public ResponseEntity<?> getAllCourses() {
        return ResponseEntity.ok(courseService.findAllCourses());
    }

}
