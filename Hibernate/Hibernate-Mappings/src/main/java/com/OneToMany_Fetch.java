package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetomany.Department;
import com.onetomany.Employee;
import com.utils.HibernateUtils;

public class OneToMany_Fetch {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		Department dept=(Department)ses.get(Department.class, 102);
		
		System.out.println("Dept Id: "+dept.getDeptId());
		System.out.println("Dept Name: "+dept.getDeptName());
	
		
		for(Employee emp:dept.getEmps()) {
			System.out.println("EMployee Id: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("----------------------------");
		}
		
		
		
		
		
		HibernateUtils.shutdown();
		

	}

}
