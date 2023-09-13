package com.goSpring.BeforeAdvice_n_AfterAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfter implements AfterReturningAdvice
{

	@Override
	public void afterReturning(Object returnValue, Method m, Object[] args, Object target) throws Throwable 
	{
		System.out.println("I am a AfterReturningAdvice "+m.getName()+"() executed");
		System.out.println("Transaction successfull!");
	}

}
