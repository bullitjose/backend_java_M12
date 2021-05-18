package com.example.springGradleDemo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String serverRequest() {
		return "HELLO WORLD";
	}
	
	@RequestMapping("/hola")
	public String diguesHello() {
		return "hola";
	}
	@GetMapping("/hello")
	
	//http://localhost:8081/hello?name=pepe
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	return String.format("Hello %s!", name);
	}
}
