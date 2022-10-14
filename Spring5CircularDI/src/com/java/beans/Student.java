package com.java.beans;

public class Student {
	
	Branch branch;
//	public Student(Branch branch) {
//		this.branch = branch;
//	}

	
	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	public String getStudentName() {
		return "Name of Student as Student Bean : xyz";
	}


}
