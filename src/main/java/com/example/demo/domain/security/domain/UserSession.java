package com.example.demo.domain.security.domain;

import java.util.List;

public class UserSession {

    private String username;
    private List<SessionInfo> sessions;

    public int getCount(){
        return sessions.size();
    }
}
