package com.product.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entities.Product;

@Repository("prodDao")
public class ProductDaoImpl {
	
	@Autowired
	private SessionFactory sf;

	@Transactional
	public void saveProduct() {
		
		Session ses=sf.getCurrentSession();
	
		Product prod=new Product();
		prod.setProdId("P001");
		prod.setPrice(3846);
		prod.setProdName("Mouse");
		
		ses.save(prod);
		
		
		
		
	}

	

}
