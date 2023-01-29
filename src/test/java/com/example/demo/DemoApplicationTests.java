package com.example.demo;

import com.example.demo.domain.Account;
import com.example.demo.domain.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    PasswordEncoder passwordEncoder;



    @Test
    void contextLoads() {
        accountRepository.save(
                Account.builder()
                        .username("user")
                        .password(passwordEncoder.encode("1111"))
                        .build()
        );
    }

}
