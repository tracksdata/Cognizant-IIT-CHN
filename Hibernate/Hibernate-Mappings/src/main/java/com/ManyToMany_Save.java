package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.manytomany.Course;
import com.manytomany.Student;
import com.manytoone.Department;
import com.manytoone.Employee;
import com.utils.HibernateUtils;

public class ManyToMany_Save {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session ses = sf.openSession();

		Student s1=new Student(1,"Praveen");
		Student s2=new Student(2,"James");
		Student s3=new Student(3,"Ozvitha");
		Student s4=new Student(4,"Bucky");
		Student s5=new Student(5,"Sarah");
		
		
		Course java=new Course(10,"Java",25000);
		Course php=new Course(11,"PHP",1000);
		Course cpp=new Course(12,"CPP",50);
		
		java.getStudents().add(s1);
		java.getStudents().add(s2);
		java.getStudents().add(s3);
		java.getStudents().add(s4);
		java.getStudents().add(s5);
		
		php.getStudents().add(s1);
		php.getStudents().add(s3);
		php.getStudents().add(s5);
		
		cpp.getStudents().add(s2);
		cpp.getStudents().add(s3);
		cpp.getStudents().add(s4);
		cpp.getStudents().add(s5);
		
		ses.save(java);
		ses.save(cpp);
		ses.save(php);
		
		
		
		ses.beginTransaction().commit();

		HibernateUtils.shutdown();

	}

}
