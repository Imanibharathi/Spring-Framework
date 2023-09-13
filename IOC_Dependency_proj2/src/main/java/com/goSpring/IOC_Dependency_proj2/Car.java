package com.goSpring.IOC_Dependency_proj2;

public class Car implements Vehicle {
	int maxspeed;

	@Override
	public void move() {
	System.out.println("Car Started......");
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}

	@Override
	public String toString() {
		return "Car [maxspeed=" + maxspeed + "]";
	}
	

}
