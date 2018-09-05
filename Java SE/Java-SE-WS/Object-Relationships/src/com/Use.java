package com;

public class Use {

	public static void main(String[] args) {

		Department dept = new Department();
		dept.setDeptId(10);
		dept.setDeptName("IT");
		dept.setLoc("Chennai");
		
		Project p=new Project();
		p.setProjId(100);
		p.setProjName("Ford");

		Employee emp = new Employee();
		emp.setEmpId(1024);
		emp.setEmpName("Praveen");
		emp.setSalary(8483555);
		emp.setDept(dept);
		emp.setProj(p);
		
		System.out.println("EmpId: "+emp.getEmpId());
		System.out.println("NAME: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		
		System.out.println("Dept Id: "+emp.getDept().getDeptId());
		System.out.println("Dept Name: "+emp.getDept().getDeptName());
		System.out.println("Dept Loc: "+emp.getDept().getLoc());
		
		System.out.println("proj Id: "+emp.getProj().getProjId());
		System.out.println("Proj Name: "+emp.getProj().getProjName());
		

	}

}
