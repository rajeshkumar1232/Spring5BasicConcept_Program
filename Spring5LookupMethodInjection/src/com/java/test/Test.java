package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.CurrentAccount;
import com.java.beans.SavingAccount;
import com.java.factory.AccountFactory;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/java/resouces/applicationContext.xml");
		AccountFactory  savAccFactory = (AccountFactory) context.getBean("savingAccountFactory");
		SavingAccount savingacc = (SavingAccount) savAccFactory.getAccount();
		savingacc.createAccount();
		savingacc.updateAccout();
		savingacc.searchAccout();
		savingacc.deleteAccout();

		AccountFactory  curAccFactory = (AccountFactory) context.getBean("currentAccountFactory");
		CurrentAccount currentacc = (CurrentAccount) curAccFactory.getAccount();
		currentacc.createAccount();
		currentacc.updateAccout();
		currentacc.searchAccout();
		currentacc.deleteAccout();
	}
}
