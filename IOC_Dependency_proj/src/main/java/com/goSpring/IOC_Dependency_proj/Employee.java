package com.goSpring.IOC_Dependency_proj;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private Address ad;
	public Employee(int id, String name, double sal, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", ad=" + ad + "]";
	}

}
