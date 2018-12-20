package com.inheritance.assignment3;

/**
 * 
 * @author tushar
 *Training is an abstract class which contains an abstract method getOrderValues
 */
public abstract class Training {
	private int id;
	private String subject;
	private double fee;

	/**
	 * Parameterized Constructor
	 * @param id2
	 * @param subject2
	 * @param fee
	 */
	public Training(int id2, String subject2, double fee) 
	{
		this.id = id;
		this.subject = subject;
		this.fee = fee;
	}
	
	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public double getFees() 
	{
		return fee;
	}
	
	/**
	 * abstract method getOrderValues 
	 * @return
	 */
	public abstract double getOrderValues();
	

}
