package com.collectionFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ListEmployees {
	private static final String path = null;

	public void write(ArrayList<MyClassEmployee>  employeeListOne, String file)throws IOException {
		// Saving of object in a file
		FileOutputStream file1 = new FileOutputStream(file);			//it will create a file.
		ObjectOutputStream out = new ObjectOutputStream(file1);			//to transfer the object from one machine into another  machine

		out.writeObject(employeeListOne);

		out.close();
		file1.close();

		System.out.println("EmployeeList has been serialized");
	}

	public void read(ArrayList<MyClassEmployee> employeeList, String file) throws IOException, ClassNotFoundException {
		
		{

			FileInputStream file1 = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(file1);

			employeeList = (ArrayList<MyClassEmployee>) in.readObject();

			in.close();
			file1.close();

		}
	}

	

}
