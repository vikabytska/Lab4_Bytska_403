package com.example.lab4_.repository;

import com.example.lab4_.entity.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UsersRepository extends ReactiveCrudRepository<Users, Long> {
    Flux<Users> findByRole(String role);
}
