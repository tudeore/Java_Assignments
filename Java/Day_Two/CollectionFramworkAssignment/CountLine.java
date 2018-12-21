package com.collectionFramework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLine 
{


	public int lineCounter(String path) throws IOException 
	{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		int line = 0;
		while(reader.readLine() != null )
			line++;
			System.out.println(line);
			return line;
	}

}
