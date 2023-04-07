package com.example.LMS_Backend.Service;


import com.example.LMS_Backend.Converter.AuthorConverter;
import com.example.LMS_Backend.Models.Author;
import com.example.LMS_Backend.Repository.AuthorRepository;
import com.example.LMS_Backend.RequestDto.AuthorRequestDto;
import com.example.LMS_Backend.ResponseDto.AuthorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorRequestDto authorRequestDto){

      try{
          Author author = AuthorConverter.convertDtoToEntity(authorRequestDto);
          authorRepository.save(author);
      }
      catch(Exception e){
          log.info("createAuthor");
      }

      return "Author created";
    }

    public List<AuthorResponseDto> AuthorList(String name){
        List<Author> authors = authorRepository.findByName(name);

       List<AuthorResponseDto> authorResponseDto = AuthorConverter.convertDto(authors);
       return authorResponseDto;


    }
}
