package com.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private double salary;

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="DeptInfo",inverseJoinColumns= {@JoinColumn(name="deptId")},joinColumns= {@JoinColumn(name="empId")})
	private Department dept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
