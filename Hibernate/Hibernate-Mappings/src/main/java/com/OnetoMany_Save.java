package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetomany.Department;
import com.onetomany.Employee;
import com.onetoone.Project;
import com.utils.HibernateUtils;

public class OnetoMany_Save {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();

		Employee e1 = new Employee(1, "Praveen", 100000);
		Employee e2 = new Employee(2, "James", 200000);
		Employee e3 = new Employee(3, "Ozvitha", 300000);
		Employee e4 = new Employee(4, "Sarah", 400000);
		Employee e5 = new Employee(5, "Bucky", 500000);

		Department d = new Department();
		d.setDeptId(102);
		d.setDeptName("IT");
		
		d.getEmps().add(e1);
		d.getEmps().add(e2);
		d.getEmps().add(e3);
		d.getEmps().add(e4);
		d.getEmps().add(e5);
		
		ses.save(d);
	

		ses.beginTransaction().commit();

		HibernateUtils.shutdown();

	}

}
