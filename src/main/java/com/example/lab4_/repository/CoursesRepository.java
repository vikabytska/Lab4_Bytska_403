package com.example.lab4_.repository;

import com.example.lab4_.entity.Courses;
import com.example.lab4_.entity.Marks;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CoursesRepository extends ReactiveCrudRepository<Courses, Long> {
    Flux<Marks> findByTutorId(Long tutorId);
}
