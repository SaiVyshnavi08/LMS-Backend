package com.example.LMS_Backend.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String Country;

    @Column (name="email" , unique = true)
    private String email;

    public Author(String name, int age, String country, String email) {
        this.name = name;
        this.age = age;
        this.Country = country;
        this.email = email;
    }

    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
    private List<Book> BookList;

}
