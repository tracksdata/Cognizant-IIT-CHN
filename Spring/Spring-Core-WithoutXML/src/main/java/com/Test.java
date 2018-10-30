package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.product.config.AppConfig;
import com.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService ps= ctx.getBean("prodService",ProductService.class);
		ps.saveProduct();
		
	}

}
