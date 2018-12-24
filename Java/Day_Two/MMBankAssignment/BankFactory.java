package com.capgemini.mmbank;

public abstract class BankFactory 
{
	
	public abstract MMSavingAccount  getNewSavingAccount(String accountHolderName,double accountBalance,boolean isSalaried);
	
//--------------------------------------------------------

	public abstract MMCurrentAccount  getNewCurrentAccount(String accountHolderName,double accounBalance, double  creditLimit);
	

}