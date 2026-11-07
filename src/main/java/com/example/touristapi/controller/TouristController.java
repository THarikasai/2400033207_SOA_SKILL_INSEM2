package com.example.touristapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.example.touristapi.entity.Tourist;
import com.example.touristapi.repository.TouristRepository;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {

    @Autowired
    private TouristRepository repo;

    @GetMapping
    public ResponseEntity<?> getAll(
            @RequestHeader(value = "Token", required = false)
            String token) {

        if (token == null || !token.equals("tourist123")) {
            return ResponseEntity.status(500)
                .body("Unauthorized: Invalid Token Provided");
        }

        List<Tourist> list = repo.findAll();

        return ResponseEntity.ok(list);
    }
}