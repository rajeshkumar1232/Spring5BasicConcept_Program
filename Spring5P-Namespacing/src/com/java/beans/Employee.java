package com.java.beans;

public class Employee {
	private String eid;
	private String eName;
	private float esal;
	private String eAddr;
	private Account acc;
	

	
	public Employee(String eid, String eName, float esal, String eAddr, Account acc) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.esal = esal;
		this.eAddr = eAddr;
		this.acc = acc;
	}



	public void getEmployeeDetails() {
		System.out.println("Employee id             :"+eid);
		System.out.println("Employee name           :"+eName);
		System.out.println("Employee Salary         :"+esal);
		System.out.println("Employee Address        :"+eAddr);
		System.out.println("Employee Account details");
		System.out.println("Employee Account details:"+acc.getAccNo());
		System.out.println("Employee Account details:"+acc.getAccName());
		System.out.println("Employee Account details:"+acc.getAccType());
		System.out.println("Employee Account details:"+acc.getBal());
	}
}
