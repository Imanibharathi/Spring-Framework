package com.goSpring.MyFirst_proj;

public class Student {
	private int sid;
	private String sname;
	private double sperc;
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
	public double getSperc() {
		return sperc;
	}
	public void setSperc(double sperc) {
		this.sperc = sperc;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sperc=" + sperc + "]";
	}

}
