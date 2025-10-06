package com.vmc.spring.secuirty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {

	@GetMapping("/greet")
	public String greet(){
		System.out.println("Welcome to HelloWorld");
		return "Welcome to HelloWorld";
	}
}
