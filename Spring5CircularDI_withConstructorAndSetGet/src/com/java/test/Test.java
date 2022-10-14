package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		Student stu = (Student) context.getBean("student");
		stu.getStudentDetails();
	}

}
