package com;

public class Bank2 {

	private int accNo;
	private String custName;

	// Inner classes

	static class InnerOperations { 
		public void processSalary() {
			System.out.println("Bank Employee Salaries");
		}

	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

}
