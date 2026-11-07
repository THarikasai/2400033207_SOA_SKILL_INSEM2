package com.example.touristapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.touristapi.entity.Tourist;

public interface TouristRepository
        extends JpaRepository<Tourist, Integer> {
}