package com.example.lab4_.repository;

import com.example.lab4_.entity.Students;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentsRepository extends ReactiveCrudRepository<Students, Long> {
}
