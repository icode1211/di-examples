package com.example.demo.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication1 {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication1.class, args);
		/*
		 * 액츄에이터 사용을 위해 spring-boot-starter-actuator 의존성 추가
		 * http://localhost:8080/actuator/beans 에서 빈의 의존 관계 확인
		 *
		 * ex) car 빈이 engine 빈과 의존 관계에 있음
		 * "car1":{
		 *   "aliases":[
		 *
		 *   ],
		 *   "scope":"singleton",
		 *   "type":"com.example.demo.example1.constructor.Car1",
		 *   "resource":"file [C:\\...\\Car1.class]",
		 *   "dependencies":[
		 *	  "engine1"
		 *   ]
		 * },
		 */
	}
}
