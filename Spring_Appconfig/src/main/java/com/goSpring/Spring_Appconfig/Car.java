package com.goSpring.Spring_Appconfig;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle
{

	@Override
	public void drive() 
	{
		System.out.println("Driving Car............");
		
	}

}
