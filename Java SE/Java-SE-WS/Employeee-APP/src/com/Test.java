package com;

public class Test {

	public static void main(String[] args) {

		JuniorProgramer jp=new EmployeeDaoImpl();
		jp.findEmployee();
		jp.listAll();
		
		MidleLevelProgramer mp=new EmployeeDaoImpl();
		mp.saveEmployee();
		
	}

}
