package com.goSpring.ThrowsAdvice_Around;

public class CasioCalculator implements Calculator
{

	@Override
	public void operations(int a, int b, char ch) 
	{
		switch(ch) 
		{
		case '+': System.out.println(a+b);
		break;
		case '-': System.out.println(a-b);
		break;
		case '*': System.out.println(a*b);
		break;
		case '/': System.out.println(a/b);
		break;
		default : System.err.println("Invalid");
		}
		System.out.println("Thank you!");
		
	}

}
