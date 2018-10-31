package com.cts.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.cts.product.entities.Product;

public interface ProductDao {

	boolean saveProduct(Product product);

	Product findProduct(String prodId);

	List<Product> listAll();

	Product updateProduct(Product product);

	boolean deleteProduct(String prodId);

}