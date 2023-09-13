package com.goSpring.BeforeAdvice_n_AfterAdvice;

public class MyImplnClass implements MyInterface
{
	@Override
	public void m1() 
	{
		System.out.println("m1 method executed");
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 method executed");
		
	}

}
