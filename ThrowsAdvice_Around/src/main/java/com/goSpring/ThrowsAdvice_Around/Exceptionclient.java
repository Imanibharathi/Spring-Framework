package com.goSpring.ThrowsAdvice_Around;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class Exceptionclient implements ThrowsAdvice
{
//	public void afterThrowing(ArithmeticException e)
//	{
//		System.out.println("I am an Arithmetic Exception../");
//	}
	public void afterThrowing(Exception e)
	{
		System.out.println("I am  Exception../");
	}
//	public void afterThrowing(Method m,Object args[],Object target,Exception e)
//	{
//		System.out.println("I am  Exception../ from method "+m.getName());
//	}


}
