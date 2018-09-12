package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Value("${cupSize}")
	private String cupSize;
	
	@Value("${age}")
	private int age;
	
	@Value("${content}")
	private String content;
	
	@Autowired
	private GrilProperties grilProperties;
	
	//@RequestMapping(value= {"/hello","/hi"},method=RequestMethod.GET)
	@GetMapping(value="/hello")
    public String index(@RequestParam(value="id",required=false,defaultValue="0") Integer myId) {
		System.out.println("1111111111111111111111111111");
		return grilProperties.getCupSize()+myId;
		//return "index";
    }
}
