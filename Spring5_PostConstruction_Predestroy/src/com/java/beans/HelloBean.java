package com.java.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class HelloBean  {
	
	private String name;
	private String message;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

/*	public void init() {
		System.out.println("inint method()");
		name = "abc";
		message = " hi greeting";
	}
	
	public void destroy() {
		System.out.println("destroy method");
		name = "-";
		message ="-";
	}*/
/*	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing through afterProperty()");
		name = "abc";
		message = " hi greeting";
	}
	
	public void destroy() {
		System.out.println("destroy method");
	}
*/	
	public String  sayHello() {
		return "say hi to "+name +" and also "+message;
	}

	
	@PostConstruct
	public void initializeBean() {
		System.out.println("@PostConstruction Bean");
		name = "Users";
		message = " Hi greeting for today";
	}

	@PreDestroy
	public void destroyBean() {
		System.out.println("@PreDestroy Bean");
	}
	
}
