package ComplexNumbers;

import static org.junit.Assert.*;

import org.junit.Test;

import AssignmentDayFour.Employee;

public class TestOfComplexNumber 
{
	ComplexNumbers numberOne= new ComplexNumbers();
	ComplexNumbers numberTwo= new ComplexNumbers();
	ComplexNumbers numberThree= new ComplexNumbers();
	
	@Test
	public void numberCheck() 
	{
		numberOne.setUp(20,40);
		numberTwo.setUp(15,15);
		numberThree.sum(numberOne, numberTwo);
		
		assertEquals(35,numberThree.getRealNumber(),0);
		
	}

}
