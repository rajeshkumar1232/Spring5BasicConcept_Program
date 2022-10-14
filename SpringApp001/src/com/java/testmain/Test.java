package com.java.testmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Hellobeans;

public class Test {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("\\com\\java\\applicationContext.xml");
		Hellobeans hello = (Hellobeans) context.getBean("helloBeans");
		System.out.println(hello.sayHello());
	}


}
