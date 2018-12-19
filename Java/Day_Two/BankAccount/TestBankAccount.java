package bankaccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBankAccount 
{
	static BankAccount savingAccountTwo;
	static BankAccount savingAccountOne;
	
	@BeforeClass
	public static void b()
	{
		savingAccountTwo = new BankAccount("Anil");
		savingAccountOne = new BankAccount("Tushar", 15000);
	}

	
	@Test
	public void testOfDepositeAccountTwo()
	{
		savingAccountTwo.depositeAmount(10000);
		assertEquals(10000, savingAccountTwo.getAccountBalance(), 0);
	}

	
	@Test
	public void testOfWithdrawlAccountTwo() 
	{
		savingAccountTwo.withdrawAmount(5000);
		assertEquals(5000, savingAccountTwo.getAccountBalance(), 0);
	}

	
	@Test
	public void testOfDepositeAccountOne() 
	{
		BankAccount savingAccountOne = new BankAccount("Tushar", 15000);
		savingAccountOne.depositeAmount(15000);
		assertEquals(30000, savingAccountOne.getAccountBalance(), 0);
	}

	
	@Test
	public void testOfWithdrawlAccountOne() 
	{
		BankAccount savingAccountOne = new BankAccount("Tushar", 15000);
		savingAccountOne.withdrawAmount(12000);
		assertEquals(3000, savingAccountOne.getAccountBalance(), 0);
	}

	
	@Test
	public void testOfNextAccountNumber() 
	{
		assertEquals(3,BankAccount.getNextAccountNumber());
	}

	
	@Test
	public void testOfTransferAmonut() 
	{
		boolean result=PaymentGateway.transfer(savingAccountOne,savingAccountTwo, 500);
		assertEquals(true, result);
	}
	
	
	
	
	
	
	
}
