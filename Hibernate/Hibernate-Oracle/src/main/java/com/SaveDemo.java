package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		// Transient State
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		emp1.setEmpId(12);
		emp1.setEmpName("Ozvitha");
		emp1.setSalary(3434);
		
		emp2.setEmpId(13);
		emp2.setEmpName("Bucky");
		emp2.setSalary(343555);
		
		emp3.setEmpId(14);
		emp3.setEmpName("Rose");
		emp3.setSalary(454555);
		
		// Persistent State
		ses.save(emp1);
		ses.save(emp2);
		ses.save(emp3);
		
		
		//ses.beginTransaction().commit();
		tx.commit();
		
		System.out.println("--- Done ---");
		
		
		
		
	}

}
