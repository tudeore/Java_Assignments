package person_assignment;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import org.junit.Test;

public class PersonTest 
{
	Person personOne = new Person("Tushar", 17,7,1997);
	Person personTwo = new Person("Anil", 2, 1, 2000);

	@Test
	public void testOfCurrentAgePersonOne()						// test for current age of person one.
	{
		assertEquals("21year  5month  1days",personOne.currentAge(personTwo));
	}
	

	@Test
	public void testOfCurrentAgePersonTwo()						// test for current age of person Two.
	{
		assertEquals("18year  11month  16days",personTwo.currentAge(personTwo));
	}
	
	
	@Test
	public void isOlder() 						//test for person one is older than person two.
	{
		assertEquals("2year  5month  16days",personOne.isOlder(personTwo));
	}

}
