package com.example.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Service {

	@GetMapping("/test")
	private String test() {
		return "hello world!";
	}
	
	@GetMapping("/welcome")
	private String test1() {
		return "Thank you Welcome";
	}
}
