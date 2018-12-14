import static org.junit.Assert.*;

import org.junit.Test;


public class MultiDimentionalArrayTest {

	private MultiDimensionalArray multidimesionArrayTest = new MultiDimensionalArray(); 
	@Test
	public void ifNumberInmultidimensionArrayTest() 
	{
		 int numbers[][]={
				 {1,2,3},
				 {4,5,6}
		 };
		 assertEquals(true,multidimesionArrayTest.searchElement(4,numbers));
		}

	
		
	}
	


