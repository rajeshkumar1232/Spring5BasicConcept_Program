package com.java.beans;

public class Branch {
	
	Student student;
//	private Branch(Student student) {
//		this.student = student;
//	}
	

	
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}



	public String getBranchName() {
		return "APAC Branch";
	}
}
