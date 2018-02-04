package edu.northeastern.cs5200.cs5200spring2018singh.controllers.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class HelloController2 {

    @Autowired
    HelloRepository helloRepository;

    @RequestMapping("/api/hello/insert")
    public HelloObject2 insertHelloObject() {
        HelloObject2 obj = new HelloObject2("Hello Saurabh Singh!");
        helloRepository.save(obj);
        return obj;
    }

    @RequestMapping("/api/hello/insert/{msg}")
    public HelloObject2 insertMessage(@PathVariable("msg") String message) {
        HelloObject2 obj = new HelloObject2(message);
        helloRepository.save(obj);
        return obj;
    }

    @RequestMapping("/api/hello/select/all")
    public List<HelloObject2> selectAllHelloObjects() {
        List<HelloObject2> hellos = (List<HelloObject2>)helloRepository.findAll();
        return hellos;
    }

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
