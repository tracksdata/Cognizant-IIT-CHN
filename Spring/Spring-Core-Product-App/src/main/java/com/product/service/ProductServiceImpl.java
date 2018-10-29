package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.model.Product;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	public void saveProduct(Product prod) {
		prodDao.saveProduct(prod);

	}

	public Product findProduct(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

}
