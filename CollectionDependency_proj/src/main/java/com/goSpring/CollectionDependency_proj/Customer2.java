package com.goSpring.CollectionDependency_proj;

import java.util.Objects;

public class Customer2 {
	int id;
	String name;
	long mob;
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
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	
	@Override
	public String toString() {
		return "Customer2 [id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer2 other = (Customer2) obj;
		return id == other.id;
	}
	
		

}
