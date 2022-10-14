package com.java.beans;

public class HelloBean {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hi "+ name +" from Hellobean!s";
	}

}
