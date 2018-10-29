package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee e1 = (Employee) ac.getBean("http://www.abc.com");
		Employee e2 = (Employee) ac.getBean("emp1");
		
		//// Employee e2 = (Employee) ac.getBean("emp1");

		// System.out.println(e1.hashCode());
		 //System.out.println(e2.hashCode());
		 
		 
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		
		System.out.println(e2.getEmpId());
		System.out.println(e2.getEmpName());


		System.out.println("--- Done");
		
		

	}

}
