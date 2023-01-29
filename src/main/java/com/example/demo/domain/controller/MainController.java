package com.example.demo.domain.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final SessionRegistry sessionRegistry;

    @GetMapping("/sessions")
    public String sessions(Model model){

        return "/sessionList";
    }

}
