package com.goSpring.Autowiring;

public class Student {
	String sname;
	Course cr;
	Student(Course cr)
	{
		this.cr=cr;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Course getCr() {
		return cr;
	}
	
	

}
