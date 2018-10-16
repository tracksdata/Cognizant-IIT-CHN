package com.employee.dao;

import java.util.List;

import com.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean saveEmployee(Employee emp) {
		System.out.println("-- Employee Saved to DB "+emp.getEmpName());
		return false;
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

}
