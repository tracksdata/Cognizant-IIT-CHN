package com;

public class Employee {

	private int empId;
	private String empName;

	public Employee(int empId) {
		this.empId = empId;
	}

	public Employee(String empName) {
		this.empName = empName;
	}

	public Employee(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public boolean equals(Object obj) {

		Employee emp = (Employee) obj;

		return (empId == emp.getEmpId() && empName.equals(emp.getEmpName()));
	}

	@Override
	public int hashCode() {

		return empId;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
