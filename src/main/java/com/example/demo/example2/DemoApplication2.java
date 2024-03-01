package com.example.demo.example2;

import com.example.demo.example2.setter.AnotherEngine2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.example.demo.example2.setter.Car2;

@SpringBootApplication
public class DemoApplication2 {

	private static ApplicationContext appContext;

	public DemoApplication2(ApplicationContext appContext) {
		this.appContext = appContext;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication2.class, args);

		// Car2 클래스는 setter 메서드가 있기 때문에 강제로 다른 객체를 주입할 수 있음
		// (Car1은 setter 메서드 없이 생성자로 의존 관계를 주입해서 문제 없음)
		// (Car1은 의존 관계가 불변이라고 할 수 있음)

		// 어플리케이션 실행 직후: Car2의 엔진은 Engine2 라고 출력됨
		appContext.getBean(Car2.class).printEngine();

		// Car2 빈에 임의의 객체를 주입 후: Car2의 엔진은 AnotherEngine2 라고 출력됨
		appContext.getBean(Car2.class).setEngine2(new AnotherEngine2());
		appContext.getBean(Car2.class).printEngine();
	}
}
