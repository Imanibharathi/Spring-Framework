package com.goSpring.BeforeAdvice_n_AfterAdvice;

public class ICICI_Bank implements Bank
{

	@Override
	public void withdraw(int amt) 
	{
		System.out.println("Withdraw Amount = "+amt);
	}

	@Override
	public void deposit(int amt) 
	{
		System.out.println("Deposit Amount = "+amt);
	}

}
