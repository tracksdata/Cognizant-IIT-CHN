package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.employee.dao.utils.DbUtils;
import com.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean saveEmployee(Employee emp) {

		int status = 0;
		try {
			Connection con = DbUtils.getConnection();
			String qry = "insert into employee values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setString(2, emp.getEmpName());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(1, emp.getEmpId());
			status = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean result = false;
		if (status != 0)
			result = true;

		System.out.println("-- Employee Saved to DB " + emp.getEmpName());
		return result;
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
