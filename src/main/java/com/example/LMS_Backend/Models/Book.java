package com.example.LMS_Backend.Models;

import com.example.LMS_Backend.Enums.Genere;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Enumerated(value = EnumType.STRING)
    private Genere genere;

    public Book(String name, Genere genere) {
        this.name = name;
        this.genere = genere;
    }

    @ManyToOne
    @JoinColumn
    private Author author;

    @ManyToOne
    @JoinColumn
    private Card card;
}
