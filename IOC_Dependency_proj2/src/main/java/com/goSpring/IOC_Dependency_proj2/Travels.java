package com.goSpring.IOC_Dependency_proj2;

public class Travels implements journey {
	Vehicle v;

	

	public void setV(Vehicle v) {
		this.v = v;
	}

	@Override
	public void Startjourney() {
		v.move();
		
	}

	@Override
	public String toString() {
		return "Travels [v=" + v + "]";
	}
	

}
