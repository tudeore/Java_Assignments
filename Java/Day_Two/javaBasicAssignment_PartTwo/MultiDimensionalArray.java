import org.junit.rules.TemporaryFolder;


public class MultiDimensionalArray 
{
	
	public Boolean searchElement(int valueToFind, int numbers[][]) //Inputs from jUnit test
	{
		for(int temporary[]:numbers)
		{
			
			for( int temporaryElement: temporary)			
			{
				if(temporaryElement == valueToFind)      //Compare expected value with Element of array.
				{
					return true;					// return true if number is found.
				}
			}
		}
		return false;								//return false if number is not found.
		
	}

}
