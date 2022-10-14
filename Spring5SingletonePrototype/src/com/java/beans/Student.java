package com.java.beans;

public class Student {

	private String sid;
	private String sname;
	private String saddr;
	private Course course;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	public void getStudentdetails() {
		System.out.println("Student id                            : "+sid);
		System.out.println("Student Name                          : "+sname);
		System.out.println("----------------------------------------");
		System.out.println("Student Corse details               : "+course.getCid());
		System.out.println("Student Corse details               : "+course.getCname());
		System.out.println("Student Corse details               : "+course.getCcost());
	}
	
}
