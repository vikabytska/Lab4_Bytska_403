package com.example.lab4_.repository;

import com.example.lab4_.entity.Tutors;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TutorsRepository extends ReactiveCrudRepository<Tutors, Long> {
}
