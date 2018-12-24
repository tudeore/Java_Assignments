package com.capgemini.mmbank;

import java.io.IOException;

public abstract class CurrentAccount extends BankAccount
{
	final double creditLimit;

	public CurrentAccount(String accountHolderName, double accounBalance,double creditLimit2) //constructor
	{
		super(accountHolderName, accounBalance);
		this.creditLimit = creditLimit2;
		
	}
//---------------------withdraw function---------------------------------------------------------------------------------

	@Override
	public abstract void withDraw(double withdraw) throws InsufficientBalanceException, InvalidAmountException;				//function
	
}
