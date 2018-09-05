package com;

public class ContractEmployee extends Employee {

	private int noOfHours;
	private int hourCost;

	@Override
	public void computeSalary() {
		noOfHours = 50;
		hourCost = 5500;
		setSalary(noOfHours * hourCost);
	}

}
