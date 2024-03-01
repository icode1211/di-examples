package com.example.demo.example1.constructor;

import org.springframework.stereotype.Component;

@Component
public class Car1 {
    private final Engine1 engine1;

    public Car1(Engine1 engine1) {
        this.engine1 = engine1;
    }
}
