package com.cicd.cicdappliedtospringbootjavaapp;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdAppliedToSpringBootJavaAppApplication {

	@GetMapping("/")
	public String home()
	{
		return "Hello world from DZONE";
	}
	
	public static void main(String[] args) {
		//SpringApplication.run(CicdAppliedToSpringBootJavaAppApplication.class, args);
        SpringApplication app = new SpringApplication(CicdAppliedToSpringBootJavaAppApplication.class);
        app.setDefaultProperties(Collections
          .singletonMap("server.port", "8083"));
        app.run(args);
	}

}
