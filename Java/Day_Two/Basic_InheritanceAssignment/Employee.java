package com.collectionFramework;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	private double salary;

	public Employee(int id, String name, double salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
