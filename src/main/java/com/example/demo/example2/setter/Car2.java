package com.example.demo.example2.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car2 {
    private Engine2 engine2;

    /**
     * 이미 의존관계 주입이 끝난 engine2 를 다른 객체로 바꿀 수 있음
     */
    @Autowired
    public void setEngine2(Engine2 engine2) {
        this.engine2 = engine2;
    }

    public void printEngine() {
        System.out.println(this.engine2);
    }
}
