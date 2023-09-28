package com.example.springboot_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class hello {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello World");
        return "最喜欢三叶啦";
    }
    @RequestMapping("/hello2")
    public String hello2() {
        System.out.println("Hello World");
        return "还是最喜欢三叶呀";
    }
}
