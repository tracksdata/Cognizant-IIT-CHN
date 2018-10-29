package com.product.dao;

import com.product.model.Product;

public interface ProductDao {

	void saveProduct(Product prod);

	Product findProduct(String prodId);

}
