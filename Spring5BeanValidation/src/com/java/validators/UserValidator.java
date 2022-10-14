package com.java.validators;

import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.java.beans.User;

public class UserValidator implements Validator {

	private Resource reso;
	public void setReso(Resource reso) {
		this.reso = reso;
	}

	@Override
	public boolean supports(Class<?> cls) {
		return User.class.equals(cls);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		try {
		User user = (User) obj;	
		Properties prop = PropertiesLoaderUtils.loadProperties(reso);

		if(user.getUsername() == null || user.getUsername().equals("")) {
			errors.rejectValue("username","error.username.required",prop.getProperty("error.username.required"));
		}
		if(user.getPassword() == null || user.getPassword().equals("")) {
			errors.rejectValue("password","error.password.required",prop.getProperty("error.password.required"));
		}if(user.getPassword().length() >= 6) {
			errors.rejectValue("password","error.password.required",prop.getProperty("error.password.maxlength"));
		}if(user.getPassword().length() <= 1) {
			errors.rejectValue("password","error.password.required",prop.getProperty("error.password.minlength"));
		}
		
		
		if(user.getAge() == 0) {
			errors.rejectValue("age","error.age.required",prop.getProperty("error.age.required"));
		}else if (user.getAge() >15 || user.getAge() < 30) {
			errors.rejectValue("age","error.age.required",prop.getProperty("error.age.minmax"));
		}
		if(user.getEmail() == null || user.getEmail().equals("")) {
			errors.rejectValue("email","error.email.required",prop.getProperty("error.email.required"));
		}else if (!user.getEmail().contains("@")) {
			errors.rejectValue("email","error.email.verifed",prop.getProperty("error.email.verifed"));
		}
		if(user.getMobile() == null || user.getMobile().equals("")) {
			errors.rejectValue("mobile","error.mobile.required",prop.getProperty("error.mobile.required"));
		}

		
		
/*		if(user.getUsername() == null || user.getUsername().equals("")) {
			errors.rejectValue("username","error.username.required","username is required");
		}
		if(user.getPassword() == null || user.getPassword().equals("")) {
			errors.rejectValue("password","error.password.required","password is required");
		}
		if(user.getAge() == 0) {
			errors.rejectValue("age","error.age.required","age is required");
		}
		if(user.getEmail() == null || user.getEmail().equals("")) {
			errors.rejectValue("email","error.email.required","email is required");
		}
		if(user.getMobile() == null || user.getMobile().equals("")) {
			errors.rejectValue("mobile","error.mobile.required","mobile is required");
		}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
