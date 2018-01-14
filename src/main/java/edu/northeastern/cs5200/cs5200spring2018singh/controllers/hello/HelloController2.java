package edu.northeastern.cs5200.cs5200spring2018singh.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {

    @RequestMapping("/api/hello/string")
    public String sayHello() {
        return "Hello Saurabh Singh!";
    }

    @RequestMapping("/api/hello/object")
    public HelloObject2 sayHelloObject() {
        HelloObject2 obj = new HelloObject2("Hello Saurabh Singh!");
        return obj;
    }

}
