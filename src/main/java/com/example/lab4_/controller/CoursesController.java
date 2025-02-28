package com.example.lab4_.controller;

import com.example.lab4_.entity.Courses;
import com.example.lab4_.service.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class CoursesController {
    private final CoursesService coursesService;

    @GetMapping("/courses")
    public Flux<Courses> getAllCourses() {
        return coursesService.findAll();
    }

    @PostMapping("/courses")
    public Mono<Courses> saveCourses(@RequestBody Courses courses) {
        return coursesService.save(courses);
    }

}
