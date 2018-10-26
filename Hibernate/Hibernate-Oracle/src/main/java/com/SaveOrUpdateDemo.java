package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
	
		Employee emp=new Employee();
		
		emp.setEmpId(11);
		emp.setEmpName("C");
		emp.setSalary(9876);
		
		ses.saveOrUpdate(emp);
		
		
		
		tx.commit();
		
		System.out.println("--- Done ---");
		
		
		
		
	}

}
