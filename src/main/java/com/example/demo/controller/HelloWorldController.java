package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Value("${cupSize}")
	private String cupSize;
	
	@Value("${age}")
	private int age;
	
	@Value("${content}")
	private String content;
	
	@RequestMapping("/hello")
    public String index() {
		System.out.println("1111111111111111111111111111");
        return content;
    }
}
