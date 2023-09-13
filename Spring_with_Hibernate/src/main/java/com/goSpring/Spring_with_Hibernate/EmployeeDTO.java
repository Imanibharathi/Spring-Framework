package com.goSpring.Spring_with_Hibernate;

public class EmployeeDTO 
{
	int id;
	String name;
	double sal;
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	

}
