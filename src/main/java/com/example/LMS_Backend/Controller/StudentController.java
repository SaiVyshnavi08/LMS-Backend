package com.example.LMS_Backend.Controller;

import com.example.LMS_Backend.RequestDto.StudentRequestDto;
import com.example.LMS_Backend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/createstudent")
    public ResponseEntity<String> CreateStudent(@RequestBody()StudentRequestDto studentRequestDto){
        studentService.CreateStudent(studentRequestDto);
        return new ResponseEntity<>("Sudent and card added succesfully" , HttpStatus.CREATED);
    }
}
