package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.HelloBean;
import com.java.beans.WelcomeBean;
import com.java.beans.WishBean;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/java/resource/applicationContext.xml");
/*		WishBean wbean = (WishBean) context.getBean("wisBean");
		System.out.println(wbean.wish());*/
		
		HelloBean hbean = (HelloBean) context.getBean("hellobean");
		System.out.println(hbean.sayHello());
		
		WelcomeBean welbean = (WelcomeBean) context.getBean("welcomeBean");
		System.out.println(welbean.sayWelcome());
	}

}
