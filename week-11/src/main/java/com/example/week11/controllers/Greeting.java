package com.example.week11.controllers;

public class Greeting {
    Long id ;
    String content;

    public Long getId() {
        return id;
    }

    public Greeting(String content,Long id) {
        this.content = content;
        this.id= id;
    }

    public String getContent() {
        return content;
    }
}
