package com;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Department {

	private int deptId;
	private String deptName;
	private String loc;

	private List<Employee> emps = new ArrayList<>();

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public static void displayEmployee(Department dept) {
		SimpleDateFormat sdm = new SimpleDateFormat("dd/MMM/yyyy");

		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Name: " + dept.getDeptName());
		System.out.println("Location: " + dept.getLoc());

		System.out.println("-----------------------------");

		for (Employee emp : dept.getEmps()) {

			System.out.println("Emp Id: " + emp.getEmpId());
			System.out.println("Name: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("DOB: " + sdm.format(emp.getDob().getTime()));
			System.out.println("----------------------------------");
		}

	}

}
