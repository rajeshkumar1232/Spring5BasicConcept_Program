package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Branch;
import com.java.beans.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		Student student = (Student) context.getBean("student1");
		System.out.println(student.getStudentName());
		
		Branch branch = (Branch) context.getBean("branch1");
		System.out.println(branch.getBranchName());
	}

}
