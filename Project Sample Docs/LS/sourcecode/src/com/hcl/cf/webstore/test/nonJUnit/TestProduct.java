package com.hcl.cf.webstore.test.nonJUnit;

import java.util.List;

import org.hibernate.Session;

import com.hcl.cf.webstore.domain.entities.Product;
import com.hcl.cf.webstore.hibernate.util.HibernateUtil;

public class TestProduct {

	public static void main(String[] args) {

		//TestProduct.createAndStoreProduct();
		TestProduct.listProducts ();
	}

	public static void createAndStoreProduct() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Product prd1 = TestProduct.createProduct("name1", "desc1");
		Product prd2 = TestProduct.createProduct("name2", "desc2");
		Product prd3 = TestProduct.createProduct("name3", "desc3");
		Product prd4 = TestProduct.createProduct("name4", "desc4");

		session.save(prd1);
		session.save(prd2);
		session.save(prd3);
		session.save(prd4);

		session.getTransaction().commit();
	}

	public static Product createProduct(String name, String desc) {

		Product prd1 = new Product();
		prd1.setDescription(desc);
		prd1.setName(name);
		return prd1;
	}

	public static void listProducts() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		List result = session.createQuery("from Product").list();

		for (int i = 0; i < result.size(); i++) {
			Product prd = (Product) result.get(i);
			TestProduct.printProduct(prd);
		}	
		session.getTransaction().commit();
	}

	public static void printProduct(Product prd) {

		System.out.println("Product..."+prd.getId());
		System.out.println(prd.getDescription());
		System.out.println(prd.getName());

	}
}
