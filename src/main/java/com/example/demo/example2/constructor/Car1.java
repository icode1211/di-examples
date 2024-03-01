package com.example.demo.example2.constructor;

import com.example.demo.example2.constructor.Engine1;
import org.springframework.stereotype.Component;

@Component
public class Car1 {
    private final Engine1 engine1;

    public Car1(Engine1 engine1) {
        this.engine1 = engine1;
    }

    /**
     * 이미 의존관계 주입이 끝난 engine1 을 다른 객체로 바꾸는 것이 불가능
     * (final 키워드로 engine1이 선언되었기 때문)
     */
//    public void setEngine1(AnotherEngine1 anotherEngine1) {
//        this.engine1 = anotherEngine1;
//    }
}
