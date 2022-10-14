package com.java.beans;

public class Student {
	private String sid;
	private String sName; 
	private Course course;
	


	public String getSid() {
		return sid;
	}



	public void setSid(String sid) {
		this.sid = sid;
	}



	public String getsName() {
		return sName;
	}



	public void setsName(String sName) {
		this.sName = sName;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public void getStudentdetails() {
		System.out.println("Student id                            : "+sid);
		System.out.println("Student Name                          : "+sName);
		System.out.println("----------------------------------------");
		System.out.println("Student Corse details               : "+course.getCid());
		System.out.println("Student Corse details               : "+course.getCname());
		System.out.println("Student Corse details               : "+course.getCcost());
	}
}




































