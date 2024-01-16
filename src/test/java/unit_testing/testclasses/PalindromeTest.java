package unit_testing.testclasses;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import unit_testing.target.PalindromeCheck;

public class PalindromeTest {

	@ParameterizedTest
	@ValueSource(strings = {"racecar","liril","madam","teja"})
	public void isPalindrome(String str) {
		
		PalindromeCheck p=new PalindromeCheck();
		boolean actual = p.isPalidrome(str);
		
		assertTrue(actual);
	}
}
