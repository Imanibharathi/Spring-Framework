package com.goSpring.BeforeAdvice_n_AfterAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBefore implements MethodBeforeAdvice
{

	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable
	{
		System.out.println("I am a MethodBeforeAdvice "+m.getName()+"() executed");
		System.out.println("Username and Password Verified");
	}
	

}
