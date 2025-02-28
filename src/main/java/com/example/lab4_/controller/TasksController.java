package com.example.lab4_.controller;

import com.example.lab4_.entity.Tasks;
import com.example.lab4_.service.TasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class TasksController {
    private final TasksService tasksService;

    @GetMapping("/tasks")
    public Flux<Tasks> getAllTasks() {
        return tasksService.findAll();
    }

    @PostMapping("/tasks")
    public Mono<Tasks> saveTasks(@RequestBody Tasks tasks) {
        return tasksService.save(tasks);
    }
}
