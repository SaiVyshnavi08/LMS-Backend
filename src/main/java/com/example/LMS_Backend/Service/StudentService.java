package com.example.LMS_Backend.Service;

import com.example.LMS_Backend.Enums.CardStatus;
import com.example.LMS_Backend.Models.Card;
import com.example.LMS_Backend.Models.Student;
import com.example.LMS_Backend.Repository.StudentRepository;
import com.example.LMS_Backend.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardService cardService;

    public String CreateStudent(StudentRequestDto studentRequestDto){

        Student student1 = new Student();

        student1.setName(studentRequestDto.getName());
        student1.setAge(studentRequestDto.getAge());
        student1.setCountry(studentRequestDto.getCountry());
        student1.setEmail(studentRequestDto.getEmail());


        Card newCard = new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student1);

        student1.setCard(newCard);

        studentRepository.save(student1);

        return "Student and Card added Succesfully";
    }
}
