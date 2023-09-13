package com.goSpring.LooseCoupling_Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle 
{
	@Autowired
	Battery bt;

	@Override
	public void drive() 
	{
		System.out.println("Riding bike..."+bt.getName());
		
	}

}
