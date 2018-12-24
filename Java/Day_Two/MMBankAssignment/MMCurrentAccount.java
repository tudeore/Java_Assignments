package com.capgemini.mmbank;

import java.io.IOException;

public class MMCurrentAccount extends CurrentAccount
{

	public MMCurrentAccount(String accountHolderName, double accounBalance,double creditLimit) 
	{
		super(accountHolderName, accounBalance, creditLimit);
		
	}

	@Override
	public void withDraw(double withdraw) throws InsufficientBalanceException, InvalidAmountException
	{
		if (super.getAccountBalance() >= withdraw || (super.getAccountBalance() + creditLimit) >= withdraw)
		{
			super.deposit(-withdraw);
			System.out.println(withdraw);
		}
		
		if(super.getAccountBalance()<withdraw) 
			throw new InsufficientBalanceException("Insufficient Balance");
		
		 if(withdraw < 0) 
			throw new InvalidAmountException("Invalid Amount");
			
		}
	}
