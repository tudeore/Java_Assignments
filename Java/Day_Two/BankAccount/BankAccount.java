package bankaccount;

public class BankAccount 
{
	private String accountHolderName;
	private int accountNumber;
	private double accountBalance;

	private static int nextAccountNumber;

	static 
	{
		nextAccountNumber = 1;
	}

	public static int getNextAccountNumber() 
	{
		return nextAccountNumber;
	}

	public BankAccount(String name)
	{
		this.accountHolderName = name;
		this.accountNumber = nextAccountNumber++;
	}

	public BankAccount(String name, int accountBalance) 
	{
		this.accountHolderName = name;
		this.accountBalance = accountBalance;
		this.accountNumber = nextAccountNumber++;
	}

	public String getAccountHolderName()
	{
		return accountHolderName;
	}

	public double getAccountNumber() 
	{
		return accountNumber;
	}

	public double getAccountBalance() 
	{
		return accountBalance;
	}

	
	public double withdrawAmount(double withdrawAmount)
	{
		if (this.accountBalance >= withdrawAmount && this.accountBalance > 0) 
		{
			System.out.println("hhjjg" + this.accountBalance);
			this.accountBalance = this.accountBalance - withdrawAmount;
			return this.accountBalance;
		} else 
			{
				System.out.println(this.accountBalance);
				return 0;
			}
	}

	
	public void depositeAmount(double amount) 
	{
		this.accountBalance += amount;
	}

}
