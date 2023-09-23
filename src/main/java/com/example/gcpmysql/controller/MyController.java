package com.example.gcpmysql.controller;

import com.example.gcpmysql.entity.UserEntity;
import com.example.gcpmysql.repository.UserRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MyController {

    private final UserRepository userRepository;

    public MyController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    @Cacheable(value = "users", key = "#id")
    public List<UserEntity> get() {
        return userRepository.findAll();
    }

}