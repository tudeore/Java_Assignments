import static org.junit.Assert.*;

import org.junit.Test;


public class PalindromeNumberTest {

	private Palindrome Check = new Palindrome();
	
	@Test
	public void testPalindrome() {
		assertEquals(true,Check.palindromeOrNot(1221));
	}

	@Test
	public void testNotPalindrome() {
		assertEquals(false,Check.palindromeOrNot(1221));
	}
}
