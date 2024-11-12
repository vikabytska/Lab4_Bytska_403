package com.example.lab4_.repository;

import com.example.lab4_.entity.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
}
