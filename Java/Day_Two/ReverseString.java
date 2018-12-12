
public class ReverseString 
{

	public String ReverseOrNot(String input)
	{
		String reverseString = "";
		String outputString = "";
		int lengthOfString = input.length();
		for(int counter =lengthOfString -1;counter>= 0;counter--)
		{
		reverseString += input.charAt(counter);	
		
		
		}
		
		String stringArray[] = reverseString.split(" ");
		
			for(int count = stringArray.length - 1;count>= 0;count--)
			{
			outputString += stringArray[count];
		
				if(count !=0)
				{
				outputString = outputString +" ";
				}
		
			}
			System.out.println(outputString);
			return outputString;
		
	}

	
}	