package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.utils.HibernateUtils;

public class CriteriaTest {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();

		Query q=ses.getNamedQuery("q1");
		Query q1=ses.createSQLQuery("");
	
		
		Criteria cr=ses.createCriteria(Employee.class);
		
	
		List<Integer> ids=new ArrayList<Integer>();
		ids.add(2);
		ids.add(5);
		
		
		
		//cr.add(Restrictions.eq("empId", 3));
		//cr.add(Restrictions.ge("empId", 2));
		cr.add(Restrictions.in("empId", ids));
		
		List<Employee> emps=cr.list();
		
		for(Employee emp:emps) {
			System.out.println("Id: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary() );
			
			System.out.println("Dept Id: "+emp.getDept().getDeptId());
			System.out.println("Dept name: "+emp.getDept().getDeptName());
			System.out.println("--------------------------------");
		}
		
		
		
		
		
	
		
		
		HibernateUtils.shutdown();

	}

}
