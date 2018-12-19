package bankaccount;

public class PaymentGateway {

	public static boolean transfer(BankAccount sender, BankAccount reciever,double amount)
	{
		if (sender.getAccountBalance() >= amount) 
		{
			sender.withdrawAmount(amount);
			reciever.depositeAmount(amount);
			return true;
		}
			return false;
	}

}
