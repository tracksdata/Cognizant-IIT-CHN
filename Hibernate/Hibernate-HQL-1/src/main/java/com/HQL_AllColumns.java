package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.utils.HibernateUtils;

public class HQL_AllColumns {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();

		
		Query qry=ses.createQuery("from Employee");
		List<Employee> emps=qry.list();
		
		for(Employee emp:emps) {
			System.out.println("Id: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("---------------------");
		}
		
	
		
		
		HibernateUtils.shutdown();

	}

}
