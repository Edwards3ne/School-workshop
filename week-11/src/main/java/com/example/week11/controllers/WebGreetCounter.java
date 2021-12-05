package com.example.week11.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounter {
    private AtomicLong counter=new AtomicLong();
    @GetMapping("/greeting2")
    public String greeting(Model model,@RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("counter", counter.addAndGet(1));
        return "greeting2";
    }
}
