package AssignmentDayFour;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployee {

	Employee employee = new Employee() ;

	
		@Test
		public void testOfPositiveNumber() 
		{		
			employee.setMonthlyBasic(200);
			assertEquals(2400,employee.getAnnualBasic(),3);
		}
		
		@Test
		public void testOfNumberIsZero() 
		{
			employee.setMonthlyBasic(0);
			assertEquals(0,employee.getAnnualBasic(),0.01);
		}
		@Test
		public void testOfNumberIsNegative() 
		{
			employee.setMonthlyBasic(-200);
			assertEquals(-2400,employee.getAnnualBasic(),0.01);
		}
	
		
		
}


