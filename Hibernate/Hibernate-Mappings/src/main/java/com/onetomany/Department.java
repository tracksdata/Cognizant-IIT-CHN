package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Department {

	@Id
	private int deptId;
	private String deptName;

	@OneToMany(cascade=CascadeType.ALL)
	@Basic(fetch=FetchType.EAGER)
	@JoinTable(name="deptdetails",joinColumns= 
	{@JoinColumn(name="deptId")},
	inverseJoinColumns= {@JoinColumn(name="empId")})
	private List<Employee> emps = new ArrayList<Employee>();

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

}
