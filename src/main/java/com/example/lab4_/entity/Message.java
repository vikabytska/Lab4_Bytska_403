package com.example.lab4_.entity;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor

@Table(name = "message")
public class Message {

    @Id
    private Long id;
    private String data;

    public Message(String data) {
        this.data = data;
    }

}