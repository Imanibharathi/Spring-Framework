package com.goSpring.CollectionDependency_proj;

import java.util.Set;

public class Course {
	String cname;
	double fees;
	Set concepts;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Set getConcepts() {
		return concepts;
	}
	public void setConcepts(Set concepts) {
		this.concepts = concepts;
	} 

}
