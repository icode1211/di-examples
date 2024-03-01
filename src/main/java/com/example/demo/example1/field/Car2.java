package com.example.demo.example1.field;

import com.example.demo.example1.constructor.Engine1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car2 {
    @Autowired
    private Engine2 engine2;
}
