package com.example.gcpmysql.controller;

import com.example.gcpmysql.entity.User;
import com.example.gcpmysql.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class MyController {

    private final UserRepository userRepository;

    @GetMapping
    @Cacheable(value = "users", key = "#id")
    public List<User> get() {
        return userRepository.findAll();
    }

}