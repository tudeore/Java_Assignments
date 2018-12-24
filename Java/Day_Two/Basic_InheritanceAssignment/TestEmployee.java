package com.collectionFramework;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class TestEmployee {

	@Test
	public void testOfFileReadWrite() 
	{
		ObjectRead writeOne = new ObjectRead();
		try {
			assertEquals(true, writeOne.readWrite());
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
