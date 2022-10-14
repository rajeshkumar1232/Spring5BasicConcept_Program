package com.java.beans;

public class Employee {
	
	private String eid;
	private String name;
	private float salary;
	private Address addr;
	
	

	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee id               : "+eid);
		System.out.println("Employee name             : "+name);
		System.out.println("Employee salry            : "+salary);
		System.out.println("");
		System.out.println("Employee address          : "+addr.getDistic());
		System.out.println("Employee address          : "+addr.getState());
	}
	

}
