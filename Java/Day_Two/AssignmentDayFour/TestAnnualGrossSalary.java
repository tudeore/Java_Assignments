package AssignmentDayFour;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAnnualGrossSalary {

	Employee employee = new Employee();

	
	@Test
	public void monthlyGgrossSalaryIspositive () 
	{	
		employee.setMonthlyBasic(200);
		assertEquals(27000,employee.getAnnualGrossSalary(),0.01);
	}
	
	@Test
	public void monthlyGgrossSalaryIsZero () 
	{	
		employee.setMonthlyBasic(0);
		assertEquals(0,employee.getAnnualGrossSalary(),0.01);
	}
	
	
	
	
}