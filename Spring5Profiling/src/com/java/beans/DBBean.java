package com.java.beans;

public class DBBean {
	private String driverClass;
	private String driverUrl;
	private String userName;
	private String password;
	
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getDriverUrl() {
		return driverUrl;
	}
	public void setDriverUrl(String driverUrl) {
		this.driverUrl = driverUrl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void displayDBDetails() {
		System.out.println("Driver class name    : "+driverClass);
		System.out.println("Driver Url           : "+driverUrl);
		System.out.println("Driver Username      : "+userName);
		System.out.println("Driver Password      : "+password);
		
	}
	
}
