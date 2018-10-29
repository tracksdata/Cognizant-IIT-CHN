package com.product.dao;

import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository("prodDao")
public class ProductDaoImpl implements ProductDao {

	public void saveProduct(Product prod) {
		System.out.println("--- ProductDao: " + prod.getProdName() + " saved to DB");

	}

	public Product findProduct(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

}
