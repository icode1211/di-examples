package com.example.demo.example3.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Husband {
    private final Wife wife;

    public Husband(Wife wife) {
        this.wife = wife;
    }
}
