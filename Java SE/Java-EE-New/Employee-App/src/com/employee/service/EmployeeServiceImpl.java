package com.employee.service;

import java.util.List;

import com.employee.dao.EmployeeDao;
import com.employee.dao.EmployeeDaoImpl;
import com.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao empDao=new EmployeeDaoImpl();

	@Override
	public boolean saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empDao.saveEmployee(emp);
	}

	@Override
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return empDao.listAll();
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
