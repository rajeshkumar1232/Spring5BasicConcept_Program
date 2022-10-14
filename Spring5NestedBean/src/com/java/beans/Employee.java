package com.java.beans;

public class Employee {
	
	private String eid;
	private String eName;
	private float eSalary;
	private String eAdd;
	private Account acc;
	
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float geteSalary() {
		return eSalary;
	}
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}
	public String geteAdd() {
		return eAdd;
	}
	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("Employee id "+eid);
		System.out.println("Employee name "+eName);
		System.out.println("Employee salary "+eSalary);
		System.out.println("Employee Addresss "+eAdd);
		System.out.println("----------------");
		System.out.println("Account number "+acc.getAccno());
		System.out.println("Account Name "+acc.getAccName());
		System.out.println("Account type "+acc.getAccType());
		System.out.println("Balance "+acc.getBalance());
}
}