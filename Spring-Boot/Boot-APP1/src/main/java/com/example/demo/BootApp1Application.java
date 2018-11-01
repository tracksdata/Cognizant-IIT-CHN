package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cts.emp.service.EmployeeService;

@SpringBootApplication
@ComponentScan("com.cts.emp.service")
public class BootApp1Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(BootApp1Application.class, args);
		ac.getBean("empService",EmployeeService.class).test();
	}
}
