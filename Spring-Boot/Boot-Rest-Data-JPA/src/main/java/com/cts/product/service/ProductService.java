package com.cts.product.service;

import java.util.List;
import java.util.Optional;

import com.cts.product.entities.Product;

public interface ProductService {
	
	
	public List<Product> findByName(String prodName);
	public List<Product> findAll();
	public  Optional<Product> findById(String prodId);
	void deleteById(String prodId);
	public Product save(Product product);
	
	

}
