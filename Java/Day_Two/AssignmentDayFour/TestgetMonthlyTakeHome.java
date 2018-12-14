package AssignmentDayFour;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestgetMonthlyTakeHome {

	Employee employee = new Employee() ;
	@Test
	public void TestMonthlyTakeHome () 
	{	
		employee.setMonthlyBasic(3000);
		assertEquals(4557.5,employee.getMonthlyTakeHome(),0.01);
	}
}
