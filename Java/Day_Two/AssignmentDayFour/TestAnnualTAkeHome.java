package AssignmentDayFour;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnnualTAkeHome 
{
	Employee employee = new Employee() ;

	@Test
	public void TestMonthlyTakeHome () 
	{	
		employee.setMonthlyBasic(3000);
		assertEquals(54690,employee.getAnnualTakeHome(),0.01);
	}
	

}
