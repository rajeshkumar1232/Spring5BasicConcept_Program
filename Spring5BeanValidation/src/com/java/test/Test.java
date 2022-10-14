package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.java.beans.User;
import com.java.validators.UserValidator;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/java/resources/applicationContext.xml");
		User user =(User)context.getBean("userBean");
		user.getUserDetail();
		UserValidator userValidator =(UserValidator) context.getBean("userValidatorBean");
		Map<String , String> map = new HashMap<String , String>();
		MapBindingResult result =new MapBindingResult(map,"com.java.beans.User");
		userValidator.validate(user,result);
		
		List<ObjectError> list = result.getAllErrors();
		for (ObjectError obj : list) {
			System.out.println(obj.getDefaultMessage());
		}
	}

}
