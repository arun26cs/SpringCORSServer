package com.canalogies.cors.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:9090")
public class CorsController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
}
