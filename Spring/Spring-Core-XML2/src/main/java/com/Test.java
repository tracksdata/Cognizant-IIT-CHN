package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee e1 = (Employee) ac.getBean("emp");

		System.out.println("EMp Id: " + e1.getEmpId());
		System.out.println("Name: " + e1.getEmpName());

		System.out.println("Dept Id: " + e1.getDept().getDeptId());
		System.out.println("Dept Name " + e1.getDept().getDeptName());

	}

}
