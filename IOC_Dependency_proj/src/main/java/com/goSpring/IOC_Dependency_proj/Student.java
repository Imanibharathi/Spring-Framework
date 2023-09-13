package com.goSpring.IOC_Dependency_proj;

public class Student {
	private int sid;
	private String sname;
	private double perc;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", perc=" + perc + "]";
	}
	

}
