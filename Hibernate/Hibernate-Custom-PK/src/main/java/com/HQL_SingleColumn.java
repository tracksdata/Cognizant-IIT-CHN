package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.utils.HibernateUtils;

public class HQL_SingleColumn {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();

		
		Product prod=new Product();
		prod.setProdName("Book");
		prod.setPrice(4545);
		
		ses.save(prod);
		ses.persist(prod);
		
		ses.beginTransaction().commit();
		
		System.out.println("--- Product ID: "+prod.getProdId());
		
		
		
		
		HibernateUtils.shutdown();

	}

}
