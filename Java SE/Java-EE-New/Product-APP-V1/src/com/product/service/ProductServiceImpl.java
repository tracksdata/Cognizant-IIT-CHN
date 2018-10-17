package com.product.service;

import java.util.List;

import com.product.dao.ProductDao;
import com.product.dao.ProductDaoImpl;
import com.product.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao prodDao = new ProductDaoImpl();

	@Override
	public boolean saveProduct(Product product) {
		// TODO Auto-generated method stub
		return prodDao.saveProduct(product);
	}

	@Override
	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return prodDao.listAll();
	}

	@Override
	public Product findProduct(String id) {
		// TODO Auto-generated method stub
		return prodDao.findProduct(id);
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return prodDao.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(String id) {
		// TODO Auto-generated method stub
		return prodDao.deleteProduct(id);
	}

}
