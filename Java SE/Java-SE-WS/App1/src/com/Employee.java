package com;

public class Employee {

	
	Employee(){
		System.out.println("Employee Constructor");
	}
	
	
	int empId;
	String empName;
	double salary;
	static String companyName;
	
	void display() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		System.out.println("Company: "+companyName);
		System.out.println("-------------------------------------------");
	}
	
	static void display_v1(Employee emp) {
		System.out.println("Employee Id: "+emp.empId);
		System.out.println("Name: "+emp.empName);
		System.out.println("Salary: "+emp.salary);
		System.out.println("Company: "+companyName);
		System.out.println("-------------------------------------------");
		
	}

	static void f1() {
		
	}
	static {
		f1();
		System.out.println("--- s1 ");
	}
	
	static {
		System.out.println("--- s2 ");
	}
	
	static {
		System.out.println("--- s3 ");
	}
	
	{
		
		System.out.println("I1");
	}
	public static  void main(String[] args) {
		
		Test.sMethod();
		System.out.println("Power of 10th is "+Math.pow(10, 2));
		
		System.out.println("--- main method");
		Test t=new Test();
		t.s2Method();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.
		
		companyName="Cognizant Technologies";

		e1.empId = 10;
		e1.empName = "Ozvitha";
		e1.salary = 10000;
		e1.companyName="CTS";
		
		e2.empId = 20;
		e2.empName = "James";
		e2.salary = 20000;
		
		e3.empId = 30;
		e3.empName = "Bucky Wall";
		e3.salary = 30000;
		
		/*
		e1.display();
		e2.display();
		e3.display();
		*/
		
		display_v1(e1);
		display_v1(e2);
		display_v1(e3);
		

		//System.out.println("---- e1 EMpId: " + e1.empId + " and Salary: " + e1.salary + " Name is " + e1.empName+" Belongs tp "+companyName);
		//System.out.println("---- e2 EMpId: " + e2.empId + " and Salary: " + e2.salary + " Name is " + e2.empName+" Belongs tp "+companyName);
		//System.out.println("---- e3 EMpId: " + e3.empId + " and Salary: " + e3.salary + " Name is " + e3.empName+" Belongs tp "+companyName);

	}

}
