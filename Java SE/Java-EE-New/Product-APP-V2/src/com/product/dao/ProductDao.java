package com.product.dao;

import java.util.List;

import com.product.model.Product;

public interface ProductDao {

	public boolean saveProduct(Product product);

	public List<Product> listAll();

	public Product findProduct(String id);

	public boolean updateProduct(Product product);

	public boolean deleteProduct(String id);

}
