import java.util.Arrays;

public class PalindromeCountFromString {

	public String[] palindromeCount(String[] input) 
	{
		String s = "";
		String palindromString = "";
		int numberOfPalindromes = 0;
		String[] Output;
		int[] lengthOfPalindrome;
		for (int count = 0; count < input.length; count++) 
		{
			String sortingString = input[count];

			char[] array = sortingString.toCharArray();
			String reverseString = "";
			for (int counter = array.length - 1; counter >= 0; counter--)
			{
				reverseString = reverseString + array[counter];
				if (reverseString.equals(sortingString)) 
				{
					palindromString += reverseString + " ";
					numberOfPalindromes++;

				}
			}
		}
		Output = new String[numberOfPalindromes];
		lengthOfPalindrome = new int[numberOfPalindromes];
		String[] PalindromeString = palindromString.split(" ");
		for (int counter = 0; counter < numberOfPalindromes; counter++) 
		{
			Output[counter] = PalindromeString[counter];
			lengthOfPalindrome[counter] = Output[counter].length();
		}

		for (int count = 0; count < numberOfPalindromes; count++)

			System.out.println(Output[count]+ "is a palindrome String And Length is"+ lengthOfPalindrome[count]);
		for (int count = 0; count < Output.length; count++) 
		{
			for (int innerCounter = count + 1; innerCounter < Output.length - 1; innerCounter++)
			{
				if (Output[count].compareTo(Output[innerCounter]) > 0) {
					String temp = Output[count];
					Output[count] = Output[innerCounter];
					Output[innerCounter] = temp;

				} else 
				{
					String temp = Output[innerCounter];
					Output[innerCounter] = Output[count];
					Output[count] = temp;
				}
			}
		}
		for (int count = 0; count < numberOfPalindromes; count++)
		{
			System.out.println(Output[count]+ "is a palindrome string and length is"+ lengthOfPalindrome[count]);
		}
		return Output;
	}

}
