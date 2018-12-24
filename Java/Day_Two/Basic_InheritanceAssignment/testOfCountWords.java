package com.collectionFramework;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class testOfCountWords {

	@Test
	public void testOfFileIsFound() {
		WordCounter wordCounter = new WordCounter();
		try {
			wordCounter.countWord("C:/Users/tudeore/Desktop/firstdoc.txt");
			assertEquals(5,wordCounter.countWord("C:/Users/tudeore/Desktop/firstdoc.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
