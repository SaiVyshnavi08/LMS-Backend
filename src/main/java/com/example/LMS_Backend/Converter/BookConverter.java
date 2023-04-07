package com.example.LMS_Backend.Converter;

import com.example.LMS_Backend.Models.Book;
import com.example.LMS_Backend.RequestDto.BookRequestDto;

public class BookConverter {

    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){

        Book book = Book.builder().name(bookRequestDto.getName()).genere(bookRequestDto.getGenere()).build();

        return book;
    }
}
