package AssignmentDayFour;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestgetMonthlyGrossSalary {

	Employee employee = new Employee() ;

	
		@Test
		public void monthlyBasicIspositive () 
		{	
			employee.setMonthlyBasic(200);
			assertEquals(2250,employee.getMonthlyGrossSalary(),0.01);
		}
		
		@Test
		public void monthlyBasicIsZero() 
		{
			employee.setMonthlyBasic(0);
			assertEquals(0,employee.getMonthlyGrossSalary(),0.01);
		}
		
		@Test
		public void monthlyBasicIsNegative() 
		{
			employee.setMonthlyBasic(-200);
			assertEquals(0,employee.getMonthlyGrossSalary(),0.01);
		}
	
		
		
}


