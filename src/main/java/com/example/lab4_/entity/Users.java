package com.example.lab4_.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@NoArgsConstructor

@Table(name = "users")
public class Users {

    @Id
    private long id;
    private String username;
    private String password;
    private String email;
    private String role;


}
