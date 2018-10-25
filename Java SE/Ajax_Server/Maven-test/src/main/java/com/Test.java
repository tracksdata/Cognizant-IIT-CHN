package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		
		Session ses=sf.openSession();
		
		Employee emp=new  Employee();
		emp.setEmpId(12);
		emp.setEmpName("Ozvitha");
		emp.setSalary(3454555);
		
		ses.save(emp);
		
		ses.beginTransaction().commit();
		
		System.out.println("----- Done -----");
		
		
		
		
		
		

	}

}
