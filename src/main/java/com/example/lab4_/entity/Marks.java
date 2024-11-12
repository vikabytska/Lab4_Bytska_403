package com.example.lab4_.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor

@Table(name = "marks")
public class Marks {
    private long id;
    private long taskId;
    private long studentId;
    private int mark;

}
