package com.goSpring.LooseCoupling;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{

	@Override
	public void drive() 
	{
		System.out.println("Driving car.....");
		
	}
	

}
