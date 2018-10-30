package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee e1 =  ac.getBean(Employee.class);
		
		Department dept=ac.getBean("dept",Department.class);
	
		e1.setEmpId(1024);
		e1.setEmpName("James");
		
		dept.setDeptId(1);
		dept.setDeptName("HR");
		
		
		System.out.println("-- Done ---");
		
		
		
		
	

	}

}
