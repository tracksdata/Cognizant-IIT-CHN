package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetoone.Employee;
import com.utils.HibernateUtils;

public class OneToOne_Fetch {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		
		Employee emp=(Employee) ses.get(Employee.class, 2);
		System.out.println("Employee Id: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getEmpName());
		
		System.out.println("Dept Id: "+emp.getDept().getDeptId());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		
		System.out.println("project Id: "+emp.getDept().getProj().getProjId());
		System.out.println("project Name: "+emp.getDept().getProj().getProjName());
		System.out.println("-----------------------------");
		
		
		
		
		HibernateUtils.shutdown();
		

	}

}
