package com.example.LMS_Backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;


@Entity
@Table(name="student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name="company_email" , unique = true , nullable = false  )
    private String email;

    private String name;
    private int age;

    private String country;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date UpdatedOn;

    public Student(String email, String name, int age, String country) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    private Card card;
}
