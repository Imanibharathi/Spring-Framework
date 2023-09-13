package com.goSpring.CollectionDependency_proj;

public class Customer {
	int id;
	String name;
	long phno;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phno=" + phno + "]";
	}

}
