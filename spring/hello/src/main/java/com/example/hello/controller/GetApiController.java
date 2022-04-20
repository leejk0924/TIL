package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello")
    public String getHello() {
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)              // get http://localhost:9090/api/hi  (예전 방법)
    public String hi() {
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{name}
    // GetMapping에 {}안의 이름과 메서드 매개변수의 이름을 일치시켜줘야 한다.
    @GetMapping("path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }
    @GetMapping(path = "query-param02")
    public String queryParam02(@RequestParam String name,
                               @RequestParam String email,
                               @RequestParam int age) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return name + " " + email + " " + age;
    }

    // 객체의 변수명과 매칭된다.
    @GetMapping(path = "query-param03")
    public String queryParam03(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());
        return userRequest.toString();
    }
}
