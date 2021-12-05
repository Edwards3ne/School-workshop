package com.example.week11.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class FizzCounter {
    private AtomicLong counter2 =new AtomicLong();

    public AtomicLong getCounter2() {
        return counter2;
    }
    public Object size(AtomicLong counter) {
        if ((counter.get() % 5 == 0) && (counter.get() % 3 == 0)) {
            return 72;
        } else if (counter.get() % 3 == 0) {
            return 24;
        } else if (counter.get() % 5 == 0) {
            return 48;
        } else {
            return 18;
        }
    }

        public Object fizz (AtomicLong counter){
            counter.addAndGet(1);
            if ((counter.get() % 5 == 0) && (counter.get() % 3 == 0)) {
                return "FizzBuzz";
            } else if (counter.get() % 3 == 0) {
                return "Fizz";
            } else if (counter.get() % 5 == 0) {
                return "Buzz";
            } else {
                return counter.get();
            }
        }
    }

