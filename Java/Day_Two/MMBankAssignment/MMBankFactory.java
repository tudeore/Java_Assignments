package com.capgemini.mmbank;

public class MMBankFactory extends BankFactory
{
	
	public MMSavingAccount getNewSavingAccount(String accountName,double accountBalance, boolean isSalaried)
	{
		MMSavingAccount account = new MMSavingAccount(accountName, accountBalance, isSalaried);
		return account;
		
	}
	

	public MMCurrentAccount getNewCurrentAccount(String acountName,double accountBalance, double creditLimit)
	{
		MMCurrentAccount account = new MMCurrentAccount(acountName, accountBalance, creditLimit);	
		return account;	
	}
	
}


