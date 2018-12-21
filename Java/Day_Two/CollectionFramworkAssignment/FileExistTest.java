package com.collectionFramework;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author tushar
 * FileExistTest is used to test the file.
 *
 */
public class FileExistTest 
{
	private FileExist file;
	
	@Before					
	public void setUp()							
	{
		file = new FileExist();						//create a object for all test cases.
	}
	
	
	@Test
	public void testOfFileExist() 				
	{
		assertEquals(true,file.checkFileExist("C:/Users/tudeore/workspace/CollectionFramework/src/com/collectionFramework/tushar.txt"));
	}

	
	@Test
	public void testofFileExistIfPathIsIncorrect() 			// test of file exist if path is incorrect.
	{
		assertEquals(false,file.checkFileExist("C:/Users/tudeore/wrkspace/CollectionFramework/src/com/collectionFramework/tushar.txt"));
	}

	
	@Test
	public void testOfFileExistIfFileNameIsIncorrect() 		//test of file Exist if file name is incorrect.
	{
		assertEquals(false,file.checkFileExist("C:/Users/tudeore/workspace/CollectionFramework/src/com/collectionFramework/tusha.txt"));
	}
}
