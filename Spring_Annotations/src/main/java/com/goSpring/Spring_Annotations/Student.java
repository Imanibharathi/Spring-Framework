package com.goSpring.Spring_Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("101")
	int sid;
	@Value("Mani")
	String sname;
	@Value("98.90")
	double sperc;
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
