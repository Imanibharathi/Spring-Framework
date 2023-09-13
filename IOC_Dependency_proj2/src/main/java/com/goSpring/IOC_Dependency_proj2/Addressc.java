package com.goSpring.IOC_Dependency_proj2;

public class Addressc {
	private String city;
	private String state;
	private String country;
	public Addressc(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Addressc [city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
