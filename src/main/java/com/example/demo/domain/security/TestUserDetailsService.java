package com.example.demo.domain.security;

import com.example.demo.domain.Account;
import com.example.demo.domain.AccountDTO;
import com.example.demo.domain.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Slf4j
@RequiredArgsConstructor
@Service
public class TestUserDetailsService implements UserDetailsService {

    private final AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findById(username).get();
        log.info("로그인한 아이디 : => {}",account);
        //로그인한 사용자는 자동으로 권한은 ROLE USER로 지정된다.

        return AccountDTO.of(account.getUsername(),account.getPassword());
    }
}
