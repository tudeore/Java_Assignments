
public class Palindrome {

	public boolean palindromeOrNot(int number) 
	{
		int storeNumber = number ;
		int reverse = 0;
		int reminder;
		while(number>0)
		{
			reminder =  number %10;
			reverse = reverse*10 + reminder;
			number = number/10;
		}
		if(reverse == storeNumber)
		{
			System.out.println("Given input is palindrome number");
			return true;
		}
		else{
				System.out.println("given input is not a palindrome number");
				return false;
			}
	
		
	}

}
