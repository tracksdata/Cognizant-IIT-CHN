package com;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 23;
	private int empId;
	private String empName;
	private transient String info;

	public void f9999() {
	}

	void f234() {
	}

	void f3() {
	}

	private int age;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
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
