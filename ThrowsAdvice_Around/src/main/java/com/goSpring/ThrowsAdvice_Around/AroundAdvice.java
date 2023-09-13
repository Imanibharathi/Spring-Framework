package com.goSpring.ThrowsAdvice_Around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor
{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("Before bussiness logic");
		Object obj = mi.proceed();
		System.out.println("After bussiness logic");
		return null;
	}

}
