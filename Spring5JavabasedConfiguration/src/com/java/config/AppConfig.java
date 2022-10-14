package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.beans.HelloBean;
import com.java.beans.WelcomeBean;

@Configuration
public class AppConfig {
	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}
	
	@Bean
	public HelloBean hellobean() {
		HelloBean hb = new HelloBean();
		hb.setName("Users");
		return hb;
	}

	
}
