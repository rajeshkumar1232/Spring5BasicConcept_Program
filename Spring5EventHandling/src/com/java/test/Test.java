package com.java.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Account;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		Account acc = (Account) context.getBean("account");
		acc.createAccount();
		acc.deleteAccount();
		acc.searchAccount();
		acc.updateAccount();
	}

}
