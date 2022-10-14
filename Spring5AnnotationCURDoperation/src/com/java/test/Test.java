package com.java.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.config.AppConfig;
import com.java.controller.StudentController;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentController studentController = (StudentController)context.getBean("studentController");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1. ADD");
			System.out.println("2. SEARCH");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. EXIT");
			System.out.println("Enter your option : ");
			int option = Integer.parseInt(br.readLine());
			
			switch(option) {
			case 1:
				studentController.addStudent();
				break;
			case 2:
				studentController.searchStudent();
				break;
			case 3:
				studentController.updateStudent();
				break;
			case 4:
				studentController.deleteStudent();
				break;
			case 5:
				System.out.println("******Thank you.. we are exiting**********");
				System.exit(0);
				break;
			default:
				System.out.print("Enter option in between 1-5");
				break;
			}
		}
/*		MysqlDataSource ds = new MysqlDataSource();
		ds.setURL("jdbc:mysql://localhost:3306/spring");
		ds.setUser("sprinUser");
		ds.setPassword("welcome1");*/
	}

}
