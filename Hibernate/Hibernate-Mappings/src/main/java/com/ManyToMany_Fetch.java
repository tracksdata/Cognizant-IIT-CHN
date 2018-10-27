package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.manytomany.Course;
import com.manytomany.Student;
import com.onetomany.Department;
import com.onetomany.Employee;
import com.utils.HibernateUtils;

public class ManyToMany_Fetch {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtils.getSessionFactory();
		Session ses=sf.openSession();
		
		
		Course courses=(Course) ses.get(Course.class, 10);
		
		System.out.println("Course Id: "+courses.getCourseId());
		System.out.println("Name: "+courses.getCourseName());
		
		for(Student student:courses.getStudents()) {
			System.out.println("Id: "+student.getStudentId());
			System.out.println("Name: "+student.getStudentName());
			System.out.println("---------------------------------");
		}
		
		
		
		
		
		HibernateUtils.shutdown();
		

	}

}
