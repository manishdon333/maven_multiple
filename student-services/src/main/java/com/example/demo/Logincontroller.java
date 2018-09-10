package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Logincontroller {
   
	@RequestMapping("/manish")
	public String hello(){
		return "hello manish you are a good guy";
	}
}