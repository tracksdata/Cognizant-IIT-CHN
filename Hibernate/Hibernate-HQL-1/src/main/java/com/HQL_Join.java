package com;

import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.utils.HibernateUtils;

public class HQL_Join {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();

		String qry="select emp.empId,emp.empName,emp.salary,dept.deptId,dept.deptName from Employee emp,Department dept where emp.dept.deptId=dept.deptId";
		
		Query query=ses.createQuery(qry);
		
		List<Object[]> emps=query.list();
		
		
		for(int i=0;i<emps.size();i++) {
			Object objs[]=emps.get(i);
			
			for(Object obj:objs) {
				System.out.println(obj);
			}
			
			System.out.println("-----------------------");
		}
		
	/*	for(Employee emp:emps) {
			System.out.println("EmpId: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("Dept Id: "+emp.getDept().getDeptId());
			System.out.println("Name: "+emp.getDept().getDeptName());
			System.out.println("-----------------------------");
			
		}*/
	
		
		
	
		
		
		HibernateUtils.shutdown();

	}

}
