package com.cts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value= {@ComponentScan("com.cts.restcontroller"),@ComponentScan("com.cts.service")})
public class BootRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootRest1Application.class, args);
	}
}
