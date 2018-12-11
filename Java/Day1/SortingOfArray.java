import java.util.Scanner;

public class SortingOfArray
{
	public static void main(String[] args)
	{
	 	int input[] ;
	 	int searchNumber;
	 	boolean numberFound = false;
	 	
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter the lenght of array");
	 	int arrayLength = sc.nextInt();
	 	
	 	input = new int[arrayLength];
	 	
	 	System.out.println("Enter the elements of array");
	 	
	 	for(int count = 0;count<input.length;count++)
	 	{
	 	input[count] = sc.nextInt();
	 	}
	 	
	 	for(int counter = 0; counter<input.length ; counter++)
	 	{
	 		for(int counterTwo=counter+1 ; counterTwo<input.length;counterTwo++)
	 		{
	 			if(input[counter]>input[counterTwo])
	 			{
	 				int  number = input[counter];
	 				input[counter] = input[counterTwo];
	 				input[counterTwo]= number;
	 			}
	 		}
	 	}
	 	System.out.println("sorted array is: ");
	 	for(int count = 0;count<input.length;count++)
	 	{
	 	System.out.println(input[count]);
	 	}
	 	
	 	}
	 	
	  }