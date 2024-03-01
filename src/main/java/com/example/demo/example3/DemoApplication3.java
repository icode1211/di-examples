package com.example.demo.example3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication3.class, args);

		/*
		 * 해당 어플리케이션은 실행 시 에러 발생함
		 *
		 * Wife는 Husband를 참조,
		 * Husband는 Wife를 참조
		 *
		 * 서로를 참조하고 있는 형태인 순환 참조
		 * 순환 참조가 있다면 스프링 부트에서는 이를 감지하여 에러 발생
		 *
		 * (스프링 부트에서는 field, setter, 생성자 방식 모두 순환 참조가 있으면 에러 발생)
		 */
	}

}
