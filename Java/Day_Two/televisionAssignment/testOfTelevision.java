package television;

import static org.junit.Assert.*;

import org.junit.Test;

import television.Television;

public class testOfTelevision {

	Television televisionOne = new Television();
	Television televisionTwo = new Television();
	
	
	@Test
	public void testforstateOfTelevisionChannel()
	{
		televisionTwo.setState("ON");
		System.out.println("Status of Television = " + televisionTwo.getState()) ;
		assertEquals("ON",televisionTwo.getState());
	}
	
	
	@Test
	public void testOfIncreaseVolume() 
	{
		televisionOne.setVolume(5);
		televisionOne.volumeIncrease(5);
		System.out.println("volume Increase = "+ televisionOne.getVolume());
		assertEquals(10,televisionOne.getVolume());
	}
	
	@Test
	public void testOfDecreaseVolume() 
	{
		televisionOne.setVolume(5);
		televisionOne.volumeDecrease(5);
		System.out.println("Decrease volume = "+ televisionOne.getVolume());
		assertEquals(0,televisionOne.getVolume());
	}
	
	
	@Test
	public void testOfChangeChannel()
	{
		televisionOne.setChannel(10);
		televisionOne.changeChannel(15);
		System.out.println("newChannel is ="+ televisionOne.getChannel());
		assertEquals(25,televisionOne.getChannel());
	}
	
	
}