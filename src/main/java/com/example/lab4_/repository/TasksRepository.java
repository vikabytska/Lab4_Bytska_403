package com.example.lab4_.repository;

import com.example.lab4_.entity.Tasks;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TasksRepository extends ReactiveCrudRepository<Tasks, Long> {
}
