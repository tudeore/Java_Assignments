package AssignmentDayFour;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGetMonthlyDeduction {

Employee employee = new Employee() ;

	
	
	
	@Test
	public void monthlyBasicIs5000 () 
	{	
		employee.setMonthlyBasic(3000);
		assertEquals(492.5,employee.getMonthlyDeductions(),0.01);
	}
	
	@Test
	public void monthlyBasicIsAbove10000() 
	{
		employee.setMonthlyBasic(12000);
		assertEquals(6600,employee.getMonthlyDeductions(),0.01);
	}

}
