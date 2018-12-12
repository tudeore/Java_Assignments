import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseCharactersTest {

	
	private ReverseString check = new ReverseString();
	
	@Test
	public void testReverseCharacters()
	{
		assertEquals("rahsut si trams ho",check.ReverseOrNot("tushar is smart oh"));
	}
	
	@Test
	public void testReversePositiveNumber()
	{
		assertEquals("123",check.ReverseOrNot("321"));
	}
	
	@Test
	public void testReverseNegativeNumber()
	{
		assertEquals("123-",check.ReverseOrNot("-321"));
	}
	
	
	}


