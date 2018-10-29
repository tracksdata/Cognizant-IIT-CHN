package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.model.Product;
import com.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Book");
		prod.setPrice(4838);

		ProductService prodService = ac.getBean("prodService", ProductService.class);

		prodService.saveProduct(prod);

		System.out.println("--- DOne ---");

	}

}
