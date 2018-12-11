
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


	public class TestAddition {
	@BeforeClass
	public static void setup()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public static void turndown()
	{
		System.out.println("After class");
	}
	@Before
	public void setUp()
	{
	System.out.println("before");
	}
	
	@After
	public void turnDown()
	{
	System.out.println("after");
	}
	@Test
	public void TestingOfAdditionForTwoPositiveNumber()
		{
	    CalculationNumber calculationNumber= new CalculationNumber();  	
		int Result = calculationNumber.addition(50,15);
		assertEquals(65,Result);
		}
	
	@Test
	public void TestingOfAdditionForTwoNegativeNumber()
		{
	    CalculationNumber calculationNumber= new CalculationNumber();  	
		int Result = calculationNumber.addition(-50,-15);
		assertEquals(-65,Result);
		}
	
	@Test
	
	public void TestingOfAdditionForOneNegativeNumber()
		{
	    CalculationNumber calculationNumber= new CalculationNumber();  	
		int Result = calculationNumber.addition(-50,15);
		assertEquals(-35,Result);
		}
	
	@Test
	public void TestingOfAdditionForOneNegativeAndZeroNumber()
		{
	    CalculationNumber calculationNumber= new CalculationNumber();  	
		int Result = calculationNumber.addition(-50,0);
		assertEquals(-50,Result);
		}
	
	@Test
	public void TestingOfAdditionForOnePositiveAndZeroNumber()
		{
	    CalculationNumber calculationNumber= new CalculationNumber();  	
		int Result = calculationNumber.addition(50,0);
		assertEquals(50,Result);
		}
	
}
