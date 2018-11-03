package com.cts.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;
	

	public List<Product> findByName(String prodName){
		return dao.findByName(prodName);
	}
	
	@Override
	public List<Product> findAll() {
		
		// TODO Auto-generated method stub
		return  dao.findAll();
	}

	@Override
	public Optional<Product> findById(String prodId) {
		// TODO Auto-generated method stub
		
		return dao.findById(prodId);

	}

	@Override
	public void deleteById(String prodId) {
		dao.deleteById(prodId);

	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return dao.save(product);
	}

}
