package com.example.bootcampspring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;

    public ForumUser() {
        this.username = "John Smith";
    }

    public String getUsername() {
        return username;
    }
}
