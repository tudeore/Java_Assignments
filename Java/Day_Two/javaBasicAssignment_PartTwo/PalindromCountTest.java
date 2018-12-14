import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromCountTest {

	
	private PalindromeCountFromString test = new PalindromeCountFromString();
	
		@Test
		public void countPelindrome() 
		{
			String[] names = {"tushar","anil","deepika","nayan","dhule","lina","bahubali"};
			assertEquals(true,test.palindromeCount(names));
		}
	}
