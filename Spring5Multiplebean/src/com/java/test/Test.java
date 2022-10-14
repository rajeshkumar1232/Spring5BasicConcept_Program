package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("/com/java/resource/applicationContext.xml");
		HelloBean hello = (HelloBean) context.getBean("helloBean");
		HelloBean hello1 = (HelloBean) context.getBean("helloBean1");
		HelloBean hello2 = (HelloBean) context.getBean("helloBean2");
		HelloBean hello3 = (HelloBean) context.getBean("helloBean3");
		
		System.out.println(hello.sayHello());
		System.out.println(hello1.sayHello());
		System.out.println(hello2.sayHello());
		System.out.println(hello3.sayHello());
		


	}

}
