package br.edu.bribeiro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PolindromeTest {

	@Test
	public void oneWord() {
		Polindrome p = new Polindrome();

		boolean result = p.isPalindromo("madam");
		boolean result2 = p.isPalindromo("racecar");

		assertTrue(result);
		assertTrue(result2);
	}

	@Test
	public void simpleSentence() {
		Polindrome p = new Polindrome();

		boolean result = p.isPalindromo("Was it a car or a cat I saw");

		assertTrue(result);
	}

	@Test
	public void sentencesWithCommaAndMarks() {
		Polindrome p = new Polindrome();

		boolean result = p.isPalindromo("Was it a car or a cat I saw?");
		boolean result2 = p.isPalindromo("A man, a plan, a canal, Panama!");

		assertTrue(result);
		assertTrue(result2);
	}

	@Test
	public void isNotPolindrome() {
		Polindrome p = new Polindrome();

		boolean result = p.isPalindromo("Testing");
		boolean result2 = p.isPalindromo("Time is money!");

		assertTrue(!result);
		assertTrue(!result2);
	}

	@Test
	public void shouldIdentifyPolindromeAndFilterInvalidCharacteres() {
		Polindrome p = new Polindrome();

		// in portuguese
		boolean result = p.isPalindromo("Socorram-me subi no onibus em Marrocos");
		assertTrue(result);
	}

}
