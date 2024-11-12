package com.example.lab4_.controller;


import com.example.lab4_.entity.Users;
import com.example.lab4_.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/users")
    public Flux<Users> getAllUsers() {
        return usersService.findAll();
    }

    @PostMapping("/users")
    public Mono<Users> createUser(@RequestBody Users user) {
        return usersService.save(user);
    }

}
