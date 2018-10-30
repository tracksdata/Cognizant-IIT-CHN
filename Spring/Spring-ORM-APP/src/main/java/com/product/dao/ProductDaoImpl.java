package com.product.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entities.Product;

@Repository("prodDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public boolean saveProduct(Product product) {

		Session ses = sf.getCurrentSession();

		ses.save(product);

		return true;

	}

	@Override
	public Product findProduct(String prodId) {
		return sf.getCurrentSession().get(Product.class, prodId);
	}

	@Override
	public List<Product> listAll() {
		return sf.getCurrentSession().createQuery("from Product").list();
	}

	@Override
	public Product updateProduct(Product product) {

		return (Product) sf.getCurrentSession().merge(product);
	}

	@Override
	public boolean deleteProduct(String prodId) {

		Session ses = sf.getCurrentSession();
		ses.delete(prodId);
		return true;
	}

}
