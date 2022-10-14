package com.java.beans;

public class Account {
	private String accNo;
	private String accName;
	private String accType;
	private int bal;
	
	public Account(String accNo, String accName, String accType, int bal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.bal = bal;
	}

	public String getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public String getAccType() {
		return accType;
	}

	public int getBal() {
		return bal;
	}
	
	

	
	
	

}
