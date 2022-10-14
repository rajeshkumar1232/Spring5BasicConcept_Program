package com.java.beans;

public class Course {
	
	private String cid;
	private String cname;
	private int ccost;
	
	public Course(String cid, String cname, int ccost) {
		this.cid =cid;
		this.cname = cname;
		this.ccost = ccost;
	}
	
//	public String getCid() {
//		return cid;
//	}
//	public void setCid(String cid) {
//		this.cid = cid;
//	}
//	public String getCname() {
//		return cname;
//	}
//	public void setCname(String cname) {
//		this.cname = cname;
//	}
//	public int getCcost() {
//		return ccost;
//	}
//	public void setCcost(int ccost) {
//		this.ccost = ccost;
//	}
	
	public void getCourseDetails() {
		System.out.println("course id    :"+cid);
		System.out.println("course name  :"+cname);
		System.out.println("course cost  :"+ccost);
	}
	
}
