package com.sms.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	
	@GetMapping("/hello")
	public String getHello() {
	
		return "Hello";
	}
	
}
