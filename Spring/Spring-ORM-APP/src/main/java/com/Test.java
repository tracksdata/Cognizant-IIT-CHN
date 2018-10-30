package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.product.config.AppConfig;
import com.product.entities.Product;
import com.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ctx.getBean("prodService", ProductService.class);

		Product prod = new Product();
		prod.setProdId("P003");
		prod.setProdName("Book");
		prod.setPrice(12);

		//ps.saveProduct(prod);
		
		for(Product p:ps.listAll()) {
			System.out.println("Id: "+p.getProdId());
			System.out.println("Name: "+p.getProdName());
			System.out.println("Price: "+p.getPrice());
			System.out.println("-------------------------");
		}

		System.out.println("-- Done --");

	}

}
