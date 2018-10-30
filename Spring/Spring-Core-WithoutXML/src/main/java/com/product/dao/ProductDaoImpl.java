package com.product.dao;

import org.springframework.stereotype.Repository;

@Repository("prodDao")
public class ProductDaoImpl {

	public void saveProduct() {
		System.out.println("-- productDao: saveProduct method");
	}

}
