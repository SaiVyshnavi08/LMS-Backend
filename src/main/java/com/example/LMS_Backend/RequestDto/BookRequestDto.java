package com.example.LMS_Backend.RequestDto;

import com.example.LMS_Backend.Enums.Genere;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class BookRequestDto {

    private String name;

    private Genere genere ;

    private int AuthorId;


}
