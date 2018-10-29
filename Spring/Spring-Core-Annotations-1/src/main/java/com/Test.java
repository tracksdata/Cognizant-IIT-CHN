package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee e1 =  ac.getBean(Employee.class);
		
		System.out.println(e1.hashCode());

	}

}
