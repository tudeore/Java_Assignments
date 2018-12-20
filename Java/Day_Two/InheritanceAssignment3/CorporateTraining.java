package com.inheritance.assignment3;
/**
 * 
 * @author Tushar
 * Corporate Training is a child Class of a Training.
 *
 */
public class CorporateTraining extends Training 
{
	private int days;
	public CorporateTraining(int id2, String subject2, double fee,int days) 
	{
		super(id2, subject2, fee);
		this.days = days;
	}
	

	@Override
	public double getOrderValues() 						
	{
		if(this.getFees()>0 && days > 0)			
		return this.getFees()*days;
		return 0;
	}

}
