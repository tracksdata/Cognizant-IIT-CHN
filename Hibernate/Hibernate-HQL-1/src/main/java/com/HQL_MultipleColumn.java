package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.utils.HibernateUtils;

public class HQL_MultipleColumn {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();

		
		Query qry=ses.createQuery("select emp.empName,emp.salary,emp.empId from Employee as emp");
		List<Object[]> data=qry.list();
		
		
		for(int i=0;i<data.size();i++) {
			
			Object[] cols=data.get(i);
			
			for(Object col:cols) {
				System.out.println(col);
			}
			
			System.out.println("------------------");
			
			
		}
		
		
	
		
		
		HibernateUtils.shutdown();

	}

}
