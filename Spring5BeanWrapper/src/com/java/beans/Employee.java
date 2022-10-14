package com.java.beans;

public class Employee {
	
	private int eno;
	private String name;
	private float sal;
	private String addr;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee no      : "+eno);
		System.out.println("Employee Nmae    : "+name);
		System.out.println("Employee salary  : "+sal);
		System.out.println("Employee Address : "+addr);
	}

}
