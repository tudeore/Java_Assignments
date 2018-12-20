package com.inheritance.assignment3;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Tushar
 *TestOfTraining contains all permutation and combination of test cases of Corporate Training and Public Training.
 */
public class TestOfTraining {

	@Test
	public void testOfPositiveCostValues() 
	{
		Training costOfFees = new PublicTraining(12, "java", 5000, 50); 	//upcasting.
		assertEquals(250000, costOfFees.getOrderValues(), 0);
	}
	
	@Test
	public void testOfNegativeCostValues() 
	{
		Training costOfFees = new PublicTraining(12, "java", -5000, 50); 		//upcasting
		assertEquals(0, costOfFees.getOrderValues(), 0);
	}

	
	//Test case for Corporate Training.
	
	@Test
	public void testCorporateTrainingOfPositiveCostValues() 
	{
		Training GetOrderValue = new CorporateTraining(15, "Oracle", 10000, 100); 	//upcasting
		assertEquals(1000000,GetOrderValue.getOrderValues(),0);
	}
	
	@Test
	public void testCorporateTrainingOfNegativeCostValues() 
	{
		Training GetOrderValue = new CorporateTraining(15, "Oracle", -10000, 100); //upcasting
		assertEquals(0,GetOrderValue.getOrderValues(),0);
	}

}
