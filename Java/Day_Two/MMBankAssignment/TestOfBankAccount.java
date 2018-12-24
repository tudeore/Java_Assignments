package com.capgemini.mmbank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOfBankAccount {

	@Test
	public void testofDepositAmount() 
	{
		BankFactory account = new MMBankFactory();
		MMSavingAccount accountOne = account.getNewSavingAccount("Tushar", 20000, true);
		assertEquals(40000, accountOne.deposit(20000), 0);
	}

	@Test
	public void testofPositiveDepositAmount() 
	{
		BankFactory account = new MMBankFactory();
		MMCurrentAccount accountTwo = account.getNewCurrentAccount("Anil", 15000, 2000);
		assertEquals(35000, accountTwo.deposit(20000), 0);
	}

	@Test
	public void testofNegativeWithdrawAmount() throws InsufficientBalanceException, InvalidAmountException {
		BankFactory account = new MMBankFactory();
		try {
				CurrentAccount accountThree = new MMCurrentAccount("rohan", 15000, 5000);
				accountThree.withDraw(-20000);
				System.out.println(accountThree.getAccountBalance());
			} catch (Exception e) 
				{
					e.printStackTrace();
				}
	}
	
	
	@Test
	public void testofPositiveWithDrawAmount() 
	{
		BankFactory account = new MMBankFactory();
		MMCurrentAccount accountThree = account.getNewCurrentAccount("Anil", 15000, 20000);
		assertEquals(15000, accountThree.withDraw(10000), 0);
	}
	

}	