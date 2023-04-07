package com.example.LMS_Backend.Repository;

import com.example.LMS_Backend.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Integer> {

}
