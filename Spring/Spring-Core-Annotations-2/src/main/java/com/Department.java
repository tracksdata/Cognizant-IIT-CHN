package com;

import org.springframework.stereotype.Repository;

@Repository("dept")
public class Department {

	private int deptId=1;
	private String deptName="Accounts";

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

}
