package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("/com/java/resource/applicationContext.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		System.out.println(hello.sayHello());
	    context.registerShutdownHook();
		


	}

}
