package com.java.beans;

public class Employee {
	private String eid;
	private String eName;
	private float esal;
	private String eAddr;
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
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String geteAddr() {
		return eAddr;
	}
	public void seteAddr(String eAddr) {
		this.eAddr = eAddr;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
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
