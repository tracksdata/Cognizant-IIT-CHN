package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	public boolean saveEmployee(Employee emp);

	public List<Employee> listAll();

	public Employee findEmployee(int empId);

	public List<Employee> findAll(String empName);

	public boolean updateEmployee(Employee emp);

	public boolean deleteEmployee(int empId);
}
