package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		Student stu1 = (Student)context.getBean("student1");
		Student stu2 = (Student)context.getBean("student1");
		Student stu3 = (Student)context.getBean("student1");
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		//stu.getStudentdetails();
		System.out.println("");
		System.out.println(stu1.getCourse());
		System.out.println(stu2.getCourse());
		System.out.println(stu3.getCourse());
		
		
	}
}
