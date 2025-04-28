package com.foo.sen.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jt")
public class TestController {

    @GetMapping("hello")
    public String hello() {
        return "hello jenkins";
    }
}
