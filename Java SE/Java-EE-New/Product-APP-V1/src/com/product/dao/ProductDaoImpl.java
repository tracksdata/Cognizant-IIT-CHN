package com.product.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.product.model.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public boolean saveProduct(Product product) {

		
		
		if(ProductsUtilsDao.getProducts().size()!=0) {
			
			for(Product prod:ProductsUtilsDao.getProducts()) {
				if(prod.getId().equals(product.getId())) {
					return false;
				}
			}
			
			
		}

		ProductsUtilsDao.getProducts().add(product);

		return true;
	}

	@Override
	public List<Product> listAll() {

		return ProductsUtilsDao.getProducts();
	}

	@Override
	public Product findProduct(String id) {
	
		
		for(Product prod:ProductsUtilsDao.getProducts()) {
			if(prod.getId().equals(id)) {
				return prod;
			}
		}
		
		
		return null;
	}

	@Override
	public boolean updateProduct(Product product) {
		
		ListIterator<Product> li=ProductsUtilsDao.getProducts().listIterator();
		
		while(li.hasNext()) {
			Product prod=li.next();
			
			if(prod.getId().equals(product.getId())) {
				li.set(product);
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteProduct(String id) {
		
ListIterator<Product> li=ProductsUtilsDao.getProducts().listIterator();
		
		while(li.hasNext()) {
			
			Product prod=li.next();
			
			if(prod.getId().equals(id)) {
				li.remove();
			}
		}
		
		return true;
	}

}
