package com.flexon.app;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testVowels() {
    	Vowels testVowels = new Vowels("Can you hear me?");
		int ret = testVowels.countVowels();
		assertEquals(ret, 6);
    }
    
    @Test
    public void testPalindrome() {
    	Palindrome testPalindrome = new Palindrome("Was it a car or a cat I saw?");
		boolean ret = testPalindrome.ReverseAndCheckPalindrom();
		assertEquals(ret, true);
    }
    
    @Test
    public void testWords() {
    	Words testWords = new Words("I'm fine thank you!");
		int ret = testWords.countWords();
		assertEquals(ret, 5);
    }
    
    @Test
    public void testConsonants() {
    	Consonants testConsonants = new Consonants("Are you ok?");
		int ret = testConsonants.countConsonants();
		assertEquals(ret, 3);
    }
    
    @Test
    public void testLastLetterCount() {
    	LastLetterCount testLastLetterCount = new LastLetterCount("This is why.");
		String ret = testLastLetterCount.countAndSwitch();
		assertEquals(ret, "Why is this.");
    }
}
