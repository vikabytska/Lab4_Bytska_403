package com.example.lab4_.service;

import com.example.lab4_.entity.Users;
import com.example.lab4_.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UsersService {
     private final UsersRepository usersRepository;

     public Flux<Users> findAll() {
         return usersRepository.findAll();
     }

     public Mono<Users> findById(Long id) {
         return usersRepository.findById(id);
     }

     public Mono<Users> save(Users users) {
         return usersRepository.save(users);
     }

     public Mono<Void> deleteById(Long id) {
         return usersRepository.deleteById(id);
     }

    public Mono<Users> update(Users users) {
         return usersRepository.save(users);
    }

}
