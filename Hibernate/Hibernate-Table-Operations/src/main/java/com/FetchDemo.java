package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.utils.HibernateUtils;

public class FetchDemo {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		// Fetch Operations
		// 2 types
		//a. Single Row Operations (Using PK)
		//b. Multi Row Operations
		
		// a. SIngle Rwo Operations
		/*
		 * Fetch Technques
		 * ------------------
		 * 1. Eager Fetch ( get method)
		 * 2. Lazy Fetch (load method)
		 */
		
		
		Employee e1= (Employee) ses.load(Employee.class, 124);
		
		//ses.delete(e1);
		
	System.out.println(e1.getEmpId());
	System.out.println(e1.getEmpName());
	System.out.println(e1.getSalary());
		ses.beginTransaction().commit();
		System.out.println("--- Done ---");
		
		HibernateUtils.shutdown();
		

	}

}
