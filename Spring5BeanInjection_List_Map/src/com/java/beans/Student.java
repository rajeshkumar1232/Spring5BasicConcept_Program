package com.java.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String sid;
	private String sName;
	private  Address addr;
	private List<String> sqalification; 
	private Set<String> scourses;
	private Map<String, String> courseAndFaculty;
	private Properties courseAndCost;
	
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public List<String> getSqalification() {
		return sqalification;
	}
	public void setSqalification(List<String> sqalification) {
		this.sqalification = sqalification;
	}
	
	public Set<String> getScourses() {
		return scourses;
	}
	
	public void setScourses(Set<String> scourses) {
		this.scourses = scourses;
	}
	
	public Map<String, String> getCourseAndFaculty() {
		return courseAndFaculty;
	}
	
	public void setCourseAndFaculty(Map<String, String> courseAndFaculty) {
		this.courseAndFaculty = courseAndFaculty;
	}
	
	public Properties getCourseAndCost() {
		return courseAndCost;
	}
	
	public void setCourseAndCost(Properties courseAndCost) {
		this.courseAndCost = courseAndCost;
	}
	
	
	public void getStudentDetails() {
		System.out.println("Student Sid                 :"+sid);
		System.out.println("Student Name                :"+sName);
		System.out.println("Student House no            :"+addr.getHouseNo());
		System.out.println("Student Street              :"+addr.getStreet());
		System.out.println("Student City                :"+addr.getCity());
		System.out.println("Student State               :"+addr.getState());
		System.out.println("Student Country             :"+addr.getCountry());
		System.out.println("Student Qualifications      :"+sqalification);
		System.out.print("Student Qualifications      :");
			for(String qual: sqalification) {
				System.out.print(qual+" ");
			}
		System.out.println();
		System.out.println("Student Courses             :"+scourses);
		System.out.print("Student Courses             :");
			for(String course : scourses) {
				System.out.print(course+" ");
			}
		System.out.println();
		System.out.println("Student Courses and Faculty :"+courseAndFaculty);
		System.out.println("Student Courses and Cost    :"+courseAndCost);
		
	  }
	}
