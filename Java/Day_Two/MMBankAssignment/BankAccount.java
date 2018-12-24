package com.capgemini.mmbank;

import java.io.IOException;

public abstract class BankAccount 
{
	static double accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public void setAccountBalance(double accountBalance) 			//setter  for account balance.
	{
		this.accountBalance = accountBalance;
	}

	static															//Initialize account number.
	{
		accountNumber = 100;
	}
	{
		accountNumber++;
	}
	public BankAccount(String accountHolderName,double accountBalance) 		//constructor.
	{
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		
	}
	
	public double getAccountNumber() 
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
//-----------withdraw function-----------------------------------------------------------------------------------//
	
	public abstract void withDraw(double withdraw) throws InsufficientBalanceException, InvalidAmountException;
	
//---------------Deposit function-----------------------------------------------------------------------------------//
		
	public double deposit(double amount)
	{
		this.accountBalance = this.accountBalance +amount;
		//System.out.println(this.accountBalance +" ad " +this.getAccountBalance());
		return accountBalance;
	}
	
}