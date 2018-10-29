package com.product.service;

import com.product.model.Product;

public interface ProductService {
	
	
	void saveProduct(Product prod);

	Product findProduct(String prodId);

}
