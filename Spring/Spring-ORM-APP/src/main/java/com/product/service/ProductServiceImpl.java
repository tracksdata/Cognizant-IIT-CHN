package com.product.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.product.dao.ProductDao;
import com.product.entities.Product;

@Service("prodService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean saveProduct(Product product) {
		// TODO Auto-generated method stub
		return prodDao.saveProduct(product);
	}

	@Override
	@Transactional
	public Product findProduct(String prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return prodDao.listAll();
	}

	@Override
	@Transactional
	public boolean updateProduct(Product product) {
		// 1
		// 2
		// 3

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public boolean deleteProduct(String prodId) {
		// TODO Auto-generated method stub
		return false;
	}

}
