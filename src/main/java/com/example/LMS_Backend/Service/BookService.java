package com.example.LMS_Backend.Service;

import com.example.LMS_Backend.Converter.BookConverter;
import com.example.LMS_Backend.Models.Author;
import com.example.LMS_Backend.Models.Book;
import com.example.LMS_Backend.Repository.AuthorRepository;
import com.example.LMS_Backend.Repository.BookRepository;
import com.example.LMS_Backend.RequestDto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    public String createBook(BookRequestDto bookRequestDto){
        Book book = BookConverter.convertDtoToEntity(bookRequestDto);


        // I should get author entity

       int authorId = bookRequestDto.getAuthorId();

       //getting the author entity

       Author author = authorRepository.findById(authorId).get();

       book.setAuthor(author);

       //the book list need to be updated

        List<Book> currentBookList = author.getBookList();
        currentBookList.add(book);
        author.setBookList(currentBookList);

        authorRepository.save(author);

        return "succesfully added book";

    }

}

//
//@Service
//public class BookService {
//
//    @Autowired
//    AuthorRepository authorRepository;
//
//    @Autowired
//    BookRepository bookRepository;
//
//    public String createBook(BookRequestDto bookRequestDto){
//
//        Book book = BookConverter.convertDtoToEntity(bookRequestDto);
//
//        //I need to set the AuthorEntity :
//
//        int authorId = bookRequestDto.getAuthorId();
//
//        //Getting the author Entity
//        Author author  = authorRepository.findById(authorId).get();
//
//        book.setAuthor(author);
//
//        //That book list also needs to be updated
//
//        List<Book> currentListOfBooks = author.getBookList();
//        currentListOfBooks.add(book);
//        author.setBookList(currentListOfBooks);
//
//        //Save the author
//        authorRepository.save(author);
//
//        //Save the book
//        //This function will automatically be called by the parent save
//
//        return "succesfully added book";
//
//    }
//
//}
