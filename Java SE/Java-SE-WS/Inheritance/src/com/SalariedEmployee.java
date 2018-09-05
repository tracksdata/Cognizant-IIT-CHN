package com;

public class SalariedEmployee extends Employee {

	private int noOfDays;
	private int dayCost;

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getDayCost() {
		return dayCost;
	}

	public void setDayCost(int dayCost) {
		this.dayCost = dayCost;
	}

	@Override
	public void computeSalary() {
		setSalary(dayCost * noOfDays);

	}

}
