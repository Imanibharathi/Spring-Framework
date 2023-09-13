package com.goSpring.IOC_Dependency_proj;

public class Studentc {
	private int sid;
	private String sname;
	private String perc;
	public Studentc(int sid, String sname, String perc) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "Studentc [sid=" + sid + ", sname=" + sname + ", perc=" + perc + "]";
	}
	

}
