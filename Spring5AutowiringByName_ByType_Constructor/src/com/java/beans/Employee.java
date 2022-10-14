package com.java.beans;

public class Employee {
	private String empId;
	private String empName; 
	private float esal;
	private Account acc;
	private Address addr;
	
	
	
/*	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}*/
	
	public Employee(String empId, String empName, float esal, Account acc, Address addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.esal = esal;
		this.acc = acc;
		this.addr = addr;
	}



	public void getEmployeedetails() {
		System.out.println("Employee id                            : "+empId);
		System.out.println("Employee Name                          : "+empName);
		System.out.println("Employee Salay                         : "+esal);
		System.out.println("----------------------------------------");
		System.out.println("Employee Account details               : "+acc.getAccHolderName());
		System.out.println("Employee Account details               : "+acc.getAccNo());
		System.out.println("Employee Account details               : "+acc.getAccType());
		System.out.println("Employee Account details               : "+acc.getBal());
		System.out.println("----------------------------------------");
		System.out.println("Employee Address details               : "+addr.getHouseNo());
		System.out.println("Employee Address details               : "+addr.getState());
		System.out.println("Employee Address details               : "+addr.getStreet());
	}
}




































