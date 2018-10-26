package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class EvictDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
        serviceRegistryBuilder.applySettings(cfg.getProperties());
        ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		
		SessionFactory sf=cfg.buildSessionFactory(serviceRegistry);
		
		Session ses=sf.openSession();
		
		Transaction tx=ses.beginTransaction();
		
		// Transient State
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.setEmpId(130);
		emp1.setEmpName("James");
		emp1.setSalary(34343);
		
		emp2.setEmpId(129);
		emp2.setEmpName("Bucky");
		emp2.setSalary(343555);
		
		emp3.setEmpId(127);
		emp3.setEmpName("Rose");
		emp3.setSalary(454555);
		
		// Persistent State
		ses.save(emp1);
		ses.save(emp2);
		ses.save(emp3);
		
		
		// Detached state
		ses.evict(emp3);
		ses.evict(emp2);
		//ses.clear();
		//sses.close();
		
		
		//ses.beginTransaction().commit();
		tx.commit();
		
		System.out.println("--- Done ---");
		
		
		
		
	}

}
