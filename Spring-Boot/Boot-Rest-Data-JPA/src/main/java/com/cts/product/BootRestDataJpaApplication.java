package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.cts.product.restcontroller")
@EnableJpaRepositories
@EnableTransactionManagement
public class BootRestDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestDataJpaApplication.class, args);
	}
}
