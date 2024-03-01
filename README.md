## Dependency Injection (의존관계 주입) 
### DemoApplication1
* 실행 후 확인 : http://localhost:8080/actuator/beans 에서 빈의 의존 관계 확인
* (참고) 액츄에이터 사용을 위해 build.gradle 파일에 spring-boot-starter-actuator 의존성 추가 

ex) car 빈이 engine 빈과 의존 관계에 있음
```json
...
    "car1": {
        "aliases": [],
        "scope": "singleton",
        "type": "com.example.demo.example1.constructor.Car1",
        "resource": "file [C:\\Users\\skqwk\\IdeaProjects\\di-examples\\build\\classes\\java\\main\\com\\example\\demo\\example1\\constructor\\Car1.class]",
        "dependencies": [
            "engine1"   // car 빈이 engine 빈과 의존 관계에 있음
        ]
    },
...
```

### DemoApplication2
* 실행 후 확인 : Car2 클래스는 setter 메서드가 있기 때문에 강제로 다른 객체를 주입할 수 있음
  * 참고로 Car1은 setter 메서드 없이 생성자로 의존 관계를 주입해서 문제 없음
  * Car1은 의존 관계가 불변이라고 할 수 있음


### DemoApplication3
* 해당 어플리케이션은 실행 시 에러 발생함
* 이유는 순환참조 때문 : Wife는 Husband를 참조, Husband는 Wife를 참조
* 서로를 참조하고 있는 형태인 순환 참조 
  * 순환 참조가 있다면 스프링 부트에서는 이를 감지하여 에러 발생
  * (스프링 부트에서는 field, setter, 생성자 방식 모두 순환 참조가 있으면 에러 발생)