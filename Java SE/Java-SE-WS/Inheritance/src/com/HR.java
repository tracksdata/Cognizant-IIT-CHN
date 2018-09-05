package com;

public class HR {

	public static void main(String[] args) {
		
		ContractEmployee ce=new ContractEmployee();
		ce.setEmpId(10);
		ce.setEmpName("Praveeen");
		ce.computeSalary();
		ce.display();
		
		SalariedEmployee se=new SalariedEmployee();
		se.setEmpId(100);
		se.setEmpName("James");
		se.setDayCost(4000);
		se.setNoOfDays(27);
		se.computeSalary();
		se.display();

	}

}
