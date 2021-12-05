package com.example.week11.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzWoof {

        private AtomicLong counter=new AtomicLong();
        public FizzCounter fizzCounter=new FizzCounter();

        @GetMapping("/greetFizz")
        public String greeting(Model model) {
            model.addAttribute("size",fizzCounter.size(fizzCounter.getCounter2()));
            model.addAttribute("counter", fizzCounter.fizz(fizzCounter.getCounter2()));
            return "greetFizz";
        }




    }


