package date;

import static org.junit.Assert.*;

import org.junit.Test;

public class testOfDate 
{
	Date dateOne = new Date(17, 07,1997);
	Date dateTwo = new Date(29, 01, 1997);

	@Test
	public void testOfDateOne()
	{
		dateOne.toString();
		assertEquals("17/7/1997",dateOne.toString());
	}
	
	
	@Test
	public void testOfDateTwo()
	{
		dateTwo.toString();
		assertEquals("29/1/1997",dateTwo.toString());
	}
	
	@Test
	public void testOfIsSmaller()
	{
		dateOne.isSmaller(dateTwo);
		System.out.println("date one is  small =" + dateOne.isSmaller(dateTwo) );
		assertEquals(false,dateOne.isSmaller(dateTwo));
	}
	
	
	@Test
	public void testOfDiffrenceInDays()
	{
		int dateDifference[]= dateOne.differenceInDate(dateTwo);
		System.out.println("Diffrence in days = "+ dateDifference[0]);
		assertEquals(12,dateDifference[0]);
	}
	
	@Test
	public void testOfDiffrenceInMonths()
	{
		int dateDifference[]= dateOne.differenceInDate(dateTwo);
		System.out.println("Diffrence in Months = "+ dateDifference[1] );
		assertEquals(6,dateDifference[1]);
	}
	
	
	@Test
	public void testOfDiffrenceInYear()
	{
		int dateDifference[]= dateOne.differenceInDate(dateTwo);
		System.out.println("Diffrence in Year = "+ dateDifference[2]);
		assertEquals(0,dateDifference[2]);
	}
	
}