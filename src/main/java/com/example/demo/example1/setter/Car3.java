package com.example.demo.example1.setter;

import com.example.demo.example1.field.Engine2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car3 {
    private Engine3 engine3;

    @Autowired
    public void setEngine3(Engine3 engine3) {
        this.engine3 = engine3;
    }
}
