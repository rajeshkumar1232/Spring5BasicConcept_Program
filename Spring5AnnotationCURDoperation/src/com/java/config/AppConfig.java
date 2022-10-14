package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.controller.StudentController;
import com.java.controller.StudentControllerImpl;
import com.java.dao.StudentDao;
import com.java.dao.StudentDaoImpl;
import com.java.services.StudentService;
import com.java.services.StudentServiceImpl;
import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
public class AppConfig {
	
	@Bean
	public MysqlDataSource dataSource() {
		MysqlDataSource dataSource = null;
		try {
			dataSource = new MysqlDataSource();
			dataSource.setUrl("jdbc:mysql://localhost:3306/v1_schema");
			dataSource.setUser("root");
			dataSource.setPassword("root");
		} catch (Exception e) {
			e.printStackTrace();
		}
	  return dataSource;	 
	}
	
	@Bean
	public StudentDao studentDao() {
			StudentDao studentDao =  new StudentDaoImpl();
		return studentDao;
		
	}
	
	@Bean
	public StudentService studentService() {
		StudentService studentService = new StudentServiceImpl();
		return studentService;
	}

	
	@Bean
	public StudentController studentController() {
		StudentController studentController = new StudentControllerImpl();
		return studentController;
	}

}
