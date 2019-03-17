package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BootDemoPcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDemoPcfApplication.class, args);
	}

	@RestController
	class MessageController {
	@GetMapping("/hello/{name}")	
	String getMessage(@PathVariable String name)
	{
		return "Hello "+name +"Welcome to PCF platform";
	}
	
	}

}
