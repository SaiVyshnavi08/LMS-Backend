package com.example.LMS_Backend.RequestDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AuthorRequestDto {

    private String name;
    private int age;
    private String Country;

    @Column(name="email" , unique = true)
    private String email;
}
