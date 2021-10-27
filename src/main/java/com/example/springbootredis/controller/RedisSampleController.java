package com.example.springbootredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class RedisSampleController {
    @GetMapping("/")
    public String getSessionId(HttpSession session){
        session.setAttribute("name", "hong");
        //session.setMaxInactiveInterval(1);

        return session.getId();
    }
}
