package com.example.springbootredis.domain;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
public class Member implements Serializable {
    private static final long serialVersionUID = 1708925807375596799L;
    private String name;
    private String email;
}
