package com.java.beans;

public class Course {
	
	private String cid;
	private String cname;
	private String ccost;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcost() {
		return ccost;
	}
	public void setCcost(String ccost) {
		this.ccost = ccost;
	}
	
	public void getCourseDetails() {
		System.out.println("Course id    :"+cid);
		System.out.println("Course name  :"+cname);
		System.out.println("Course cost  :"+ccost);
	}

}
