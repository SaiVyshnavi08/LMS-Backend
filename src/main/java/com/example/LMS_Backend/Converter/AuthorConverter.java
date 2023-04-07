package com.example.LMS_Backend.Converter;

import com.example.LMS_Backend.Models.Author;
import com.example.LMS_Backend.RequestDto.AuthorRequestDto;
import com.example.LMS_Backend.ResponseDto.AuthorResponseDto;

import java.util.ArrayList;
import java.util.List;

public class AuthorConverter {

    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){

         Author author = Author.builder().name(authorRequestDto.getName())
                 .age(authorRequestDto.getAge()).email(authorRequestDto.getEmail()).Country(authorRequestDto.getCountry()).build();

         return author;




    }

    public static List<AuthorResponseDto> convertDto (List<Author> auths){

        List<AuthorResponseDto> authorsResponseDtoList = new ArrayList<>();

        for(Author auth : auths) {
            AuthorResponseDto authorResponseDto = AuthorResponseDto.builder().name(auth.getName()).age(auth.getAge()).id(auth.getId()).email(auth.getEmail()).country(auth.getCountry()).build();

            authorsResponseDtoList.add(authorResponseDto);
        }
   return authorsResponseDtoList;
    }
}
