import java.util.Scanner;

public class SearchArray {
public static void main(String[] args){
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
	 	System.out.println("Enter the number to search");
	 	searchNumber = sc.nextInt();
	 	
	 	for(int counter=0;counter<input.length;counter++)
	 		{
	 		if(searchNumber == input[counter] )
	 		{
	 		numberFound = true;
	 		break;
	 		}
	 		}
	 		
	 		if(numberFound == false)
	 		{
	 		System.out.println("number not found");
	 		}
	 		else
	 		System.out.println("number found");
 }
 
}
