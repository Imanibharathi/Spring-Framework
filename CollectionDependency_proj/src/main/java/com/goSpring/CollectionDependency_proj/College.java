package com.goSpring.CollectionDependency_proj;

import java.util.List;

public class College {
	String cname;
	double fee;
	List Students;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public List getStudents() {
		return Students;
	}
	public void setStudents(List students) {
		Students = students;
	}
	

}
