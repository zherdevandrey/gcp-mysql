package com.example.gcpmysql.repository;

import com.example.gcpmysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
