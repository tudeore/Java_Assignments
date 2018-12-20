package com.inheritance.assignment3;

/**
 * 
 * @author Tushar
 * PublicTraining is an child class of Training.
 *
 */
public class PublicTraining extends Training {
	

	private int participants;

	public PublicTraining(int id, String subject, double fee,int numberOfParticipents)
	{
		super(id, subject, fee); 							// calls super class constructor
		this.participants = numberOfParticipents;
	}

	/**
	 * getOrderValues is method use to get the cost values of PublicTraining.
	 */
	public double getOrderValues() 
	{
		if (this.getFees()>0 && participants>0)
		return this.getFees() * participants;
		return 0;
	}
}
