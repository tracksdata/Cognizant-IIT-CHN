package com;

public class EmployeeDaoImpl implements JuniorProgramer, MidleLevelProgramer, SerniorProgramer {

	@Override
	public void saveEmployee() {
		System.out.println("-- saving employee ");
	}

	@Override
	public void listAll() {
		System.out.println("--- Listing all employee");
	}

	@Override
	public void findEmployee() {
		System.out.println("--- Finding emplyee");
	}

	@Override
	public void deleteEmployee() {
		System.out.println("--- Deleting an employee");
	}

	@Override
	public void updateEmployee() {
		System.out.println("--- Updating employee");
	}

}
