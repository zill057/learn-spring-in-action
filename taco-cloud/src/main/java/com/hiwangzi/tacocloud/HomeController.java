package com.hiwangzi.tacocloud;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/") // 如果使用 @Controller 注解，可以不需要 @RequestMapping 注解
@Component
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}