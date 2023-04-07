package com.example.LMS_Backend.ResponseDto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor

public class AuthorResponseDto {

    private int id;
    private String name;
    private int age;
    private String country;
    private String email;

}
