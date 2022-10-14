package com.java.beans;

public class CurrentAccount implements Account{
	
	public void createAccount() {
		System.out.println("Current account Created");
	}
	
	public void searchAccout() {
		System.out.println("Current account identified");
	}
	
	public void updateAccout() {
		System.out.println("Current account updated");
	}
	
	public void deleteAccout() {
		System.out.println("Current account deleted");
	}

}
