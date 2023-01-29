package com.example.demo.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.List;

public class AccountDTO extends User {


    private String username;
    private String password;


    public AccountDTO(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.username = username;
        this.password = password;
    }

    public static AccountDTO of(String username,String password){
            return new AccountDTO(username,password, List.of(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
