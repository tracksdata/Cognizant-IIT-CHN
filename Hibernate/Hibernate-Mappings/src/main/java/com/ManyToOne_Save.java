package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.manytoone.Department;
import com.manytoone.Employee;
import com.utils.HibernateUtils;

public class ManyToOne_Save {

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
		
		
		e1.setDept(d);
		e2.setDept(d);
		e3.setDept(d);
		e4.setDept(d);
		e5.setDept(d);
		
		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5);

		ses.beginTransaction().commit();

		HibernateUtils.shutdown();

	}

}
