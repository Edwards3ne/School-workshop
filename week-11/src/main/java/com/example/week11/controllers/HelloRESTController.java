package com.example.week11.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    private AtomicLong counter=new AtomicLong();
    @RequestMapping("/greeting")
    public Greeting handleRequestMapping(@RequestParam("name")String name ){

        return new Greeting("Hello, "+name+" !",counter.addAndGet(1L));
    }
}
