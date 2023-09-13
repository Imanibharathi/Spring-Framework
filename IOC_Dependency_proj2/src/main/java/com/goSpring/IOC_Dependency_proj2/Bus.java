package com.goSpring.IOC_Dependency_proj2;

public class Bus implements Vehicle {
	int maxspeed;
	String fueltype;
	@Override
	public void move() {
		System.out.println("Bus started.....");
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public String getFueltype() {
		return fueltype;
	}
	@Override
	public String toString() {
		return "Bus [maxspeed=" + maxspeed + ", fueltype=" + fueltype + "]";
	}
	

}
