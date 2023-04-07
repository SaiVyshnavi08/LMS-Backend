package com.example.LMS_Backend.Repository;

import com.example.LMS_Backend.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
}
