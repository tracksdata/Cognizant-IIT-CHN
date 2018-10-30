package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDaoImpl;

@Service("prodService")
public class ProductService {

	@Autowired
	private ProductDaoImpl prodDao;

	public void saveProduct() {
		System.out.println("-- save product from productService");
		prodDao.saveProduct();
	}

}
