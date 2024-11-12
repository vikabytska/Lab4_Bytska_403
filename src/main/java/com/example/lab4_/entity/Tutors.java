package com.example.lab4_.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@NoArgsConstructor

@Table(name = "tutors")
public class Tutors {


    @Id
    private long id;
    private String firstName;
    private String lastName;
    private Users user;
    private long userId;


}
