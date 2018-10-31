package com.cts.product.service;

import java.util.List;

import com.cts.product.entities.Product;

public interface ProductService {

	boolean saveProduct(Product product);

	Product findProduct(String prodId);

	List<Product> listAll();

	boolean updateProduct(Product product);

	boolean deleteProduct(String prodId);

}
