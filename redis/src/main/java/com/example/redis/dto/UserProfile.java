package com.example.redis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserProfile {
    @JsonProperty
    private String name;
    @JsonProperty
    private int age;

    public UserProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
