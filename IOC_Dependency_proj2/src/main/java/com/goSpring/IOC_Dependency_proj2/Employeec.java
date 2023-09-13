package com.goSpring.IOC_Dependency_proj2;

public class Employeec {
	private int id;
	private String name;
	private double sal;
	private Addressc ad;
	public Employeec(int id, String name, double sal, Addressc ad) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Employeec [id=" + id + ", name=" + name + ", sal=" + sal + ", ad=" + ad + "]";
	}
	

}
