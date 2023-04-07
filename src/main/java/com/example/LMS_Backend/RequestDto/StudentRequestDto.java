package com.example.LMS_Backend.RequestDto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDto {
    private int age;
    private String name;
    @Column(name="company_email" , unique = true , nullable = false  )
    private String email;
    private String Country;

}
