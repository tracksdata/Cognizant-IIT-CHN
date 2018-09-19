package com;

public class Bank3 {

	private int accNo;
	private String custName;
	private int bankEmpId;
	int sample;

	public Bank3(int bankEmpId) {
		this.bankEmpId = bankEmpId;
	}

	public static void generateSalaries(int bankEmpId) {
		Bank3 b3 = new Bank3(bankEmpId);
		InnerOperations io = b3.new InnerOperations();

		io.generatePaySlip(bankEmpId);
	}

	// Inner classes

	private class InnerOperations {

		public int x = 10; // outer class can access x by creating inner class object

		public void generatePaySlip(int bankEmpId) {
			// Connect to DB to fetch salary of bankEmp from database
			accNo = 87;
			sample = 98;
			System.out.println("Bank Employee " + bankEmpId + " Payslip is Generated");
		}

	}

	public int getBankEmpId() {
		return bankEmpId;
	}

	public void setBankEmpId(int bankEmpId) {
		this.bankEmpId = bankEmpId;
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
