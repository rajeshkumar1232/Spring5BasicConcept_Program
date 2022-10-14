package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.beans.HelloBean;
import com.java.beans.WelcomeBean;
import com.java.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		WelcomeBean wb = (WelcomeBean) context.getBean("welcomeBean");
		System.out.println(wb.getWelcomeMessage());
		WelcomeBean wb1 = (WelcomeBean) context.getBean(WelcomeBean.class);
		System.out.println(wb1.getWelcomeMessage());
		
		HelloBean hb = (HelloBean) context.getBean(HelloBean.class);
		System.out.println(hb.sayHello());
		
		System.out.println(wb == wb1);

	}

}
