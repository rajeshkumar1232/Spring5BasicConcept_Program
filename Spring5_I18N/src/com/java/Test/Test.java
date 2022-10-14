package com.java.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.I18nBean;

public class Test {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		I18nBean be = (I18nBean) context.getBean("nter");
		be.displayMessage();
	}

}
