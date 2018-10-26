package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.utils.HibernateUtils;

public class SaveDemo {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
	
		Employee emp=new Employee();
		
		emp.setEmpName("Praveen");
		emp.setSalary(394734);
		emp.setDob(new Date());
		
		emp.setDeptId(1000);
		emp.setDeptLoc("Chennai");
		emp.setDeptName("IT");
		
		emp.setProjId("P001");
		emp.setProjName("Honda");

		ses.save(emp);
		
		ses.beginTransaction().commit();
		
	
		
		
		HibernateUtils.shutdown();
		

	}

}
