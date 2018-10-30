package com.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages= {"com.product.service,com.product.dao"})
@ComponentScans(value= {@ComponentScan("com.product.service"),@ComponentScan("com.product.dao")})
public class AppConfig {

	@Bean
	public void test() {
		System.out.println("---- test method from my class");
	}
	
}
