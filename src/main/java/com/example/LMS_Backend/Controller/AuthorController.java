package com.example.LMS_Backend.Controller;


import com.example.LMS_Backend.RequestDto.AuthorRequestDto;
import com.example.LMS_Backend.ResponseDto.AuthorResponseDto;
import com.example.LMS_Backend.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/createAuthor")
    public String createAuthor(@RequestBody() AuthorRequestDto authorRequestDto){

        return authorService.createAuthor(authorRequestDto);
    }

    @GetMapping("/findBy/{name}")
    public List<AuthorResponseDto> AuthorList(@PathVariable (name ="name") String name){
        return authorService.AuthorList(name);
    }


}
