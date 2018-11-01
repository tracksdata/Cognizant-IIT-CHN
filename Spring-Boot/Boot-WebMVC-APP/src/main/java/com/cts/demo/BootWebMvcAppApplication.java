package com.cts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value= {@ComponentScan("com.cts.controller")})
public class BootWebMvcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootWebMvcAppApplication.class, args);
	}
}
