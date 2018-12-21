package com.collectionFramework;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class LineCountTest 
{
	
	@Test
	public void testOfLines ()
	{
		CountLine lineCounter = new CountLine();
		int actual;
		try {
				actual = lineCounter.lineCounter("C:/Users/tudeore/workspace/CollectionFramework/src/com/collectionFramework/tushar.txt");
				assertEquals(2,actual);
			} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
  
}
