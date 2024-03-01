package com.example.demo.example3.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wife {
    private final Husband husband;

    public Wife(Husband husband) {
        this.husband = husband;
    }
}
