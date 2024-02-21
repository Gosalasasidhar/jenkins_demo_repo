package com.hexaware.springoauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloControlller {

	
	@GetMapping("/")
	public String sayHello() {
		return "Hello wellcom to our website";
	}
	
	@GetMapping("/secured")
	public String secured() {
		return "this is a secured site,acccesed using login";
	}
	
}
