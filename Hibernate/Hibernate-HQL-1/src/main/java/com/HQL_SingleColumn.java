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

		
		Query qry=ses.createQuery("select emp.empName from Employee as emp");
		List<Object> names=qry.list();
		
		for(Object name:names) {
			System.out.println("Name: "+name);
			
			//System.out.println("---------------------");
		}
		
	
		
		
		HibernateUtils.shutdown();

	}

}
