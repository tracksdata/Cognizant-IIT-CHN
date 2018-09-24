package com;

public class Bank {

	private int accNo;
	private String custName;

	// Inner classes

	public class InnerOperations { // default / public
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
