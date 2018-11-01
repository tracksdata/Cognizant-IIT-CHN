package com.cts.service;

import org.springframework.stereotype.Service;

import com.cts.entity.Product;

@Service("prodService")
public class ProductService {

	public Product getProduct() {
		
		Product prod = new Product();
		prod.setPrice(34);
		prod.setProdId("P001");
		prod.setProdName("Pen");

		return prod;

	}

}
