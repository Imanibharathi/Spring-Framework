package com.goSpring.Spring_Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student2 
{
	int sid;
	String sname;
	double sperc;
	public int getSid() {
		return sid;
	}
	@Value("102")
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	@Value("Mani")
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSperc() {
		return sperc;
	}
	@Value("98.99")
	public void setSperc(double sperc) {
		this.sperc = sperc;
	}
	@Override
	public String toString() {
		return "Student2 [sid=" + sid + ", sname=" + sname + ", sperc=" + sperc + "]";
	}
	
	
	

}
