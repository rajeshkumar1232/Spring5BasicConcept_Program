package com.java.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private String eid;
	private String eName;
	private String eSal;
	private String eAddr;
	
	//@Required//no need to use since we are using required=true 
	@Autowired(required=true)
	@Qualifier("savingAccout")
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
	public String geteSal() {
		return eSal;
	}
	public void seteSal(String eSal) {
		this.eSal = eSal;
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
		System.out.println("Id of Employee	                 : "+eid);
		System.out.println("Name of Employee                 : "+eName);
		System.out.println("Salary of Employee               : "+eSal);
		System.out.println("Address of Employee              : "+eAddr);
		System.out.println("Account no of Employee           : "+acc.getAccNo());
		System.out.println("Account holders name of Employee : "+acc.getAccHolderName());
		System.out.println("Account type of Employee         : "+acc.getAccType());
		System.out.println("Account Balance of Employee      : "+acc.getBal());
	}
}
