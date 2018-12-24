package com.capgemini.mmbank;

public class MMSavingAccount extends SavingAccount
{

	
	public MMSavingAccount(String accountHolderName, double accountBalance, boolean isSalary)
	{
		
		super(accountHolderName, accountBalance,isSalary);
	}
	


	@Override
	public void withDraw(double withdraw)
	{
		if(super.getAccountBalance() > withdraw)
		{
			//double accountBalance =  super.getAccountBalance() - withdraw;
 			super.deposit(-withdraw);
			System.out.println(withdraw);
		}
	


	}
	
	
}