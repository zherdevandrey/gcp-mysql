package com.example.gcpmysql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private int id;

    private int age;
    private String name;

    public UserEntity() {
    }

    public UserEntity(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
