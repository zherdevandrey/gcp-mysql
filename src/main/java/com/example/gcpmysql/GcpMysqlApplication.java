package com.example.gcpmysql;

import com.example.gcpmysql.entity.User;
import com.example.gcpmysql.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class GcpMysqlApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(GcpMysqlApplication.class, args);
    }

    @Override
    public void run(String... args) {
        for (int i = 0 ; i < 10; i ++) {
            User user = new User(i, "user#" + i);
            userRepository.save(user);
        }
    }
}
