package com.example.lab4_.service;

import com.example.lab4_.entity.Message;
import com.example.lab4_.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Flux<Message> list() {
        return messageRepository.findAll();
    }

    public Mono<Message> addOne(Message message) {
        return messageRepository.save(message);
    }
}
