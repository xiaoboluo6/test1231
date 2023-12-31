package com.atguigu.demojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String findAll() {
        return "hello";
    }

    @GetMapping
    public String test() {
        return "1231";
    }

    @GetMapping
    public String test2() {
        return "12316666";
    }
}
