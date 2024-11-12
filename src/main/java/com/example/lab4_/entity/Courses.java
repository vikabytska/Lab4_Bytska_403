package com.example.lab4_.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor

@Table(name = "courses")
public class Courses {
    private Long id;
    private String title;
    private String description;
    private Long tutorId;
}
