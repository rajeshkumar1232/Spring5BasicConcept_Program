package com.java.test;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.java.beans.DBBean;

public class Test {

	public static void main(String[] args) {
		//System.setProperty("spring.profiles.active", "development");
		System.setProperty("spring.profiles.active", "production");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("/com/java/resources/applicationContext-development.xml","/com/java/resources/applicationContext-production.xml");
		context.refresh();
		DBBean db1 = (DBBean) context.getBean("dbbeans");
		db1.displayDBDetails();
	}

}
