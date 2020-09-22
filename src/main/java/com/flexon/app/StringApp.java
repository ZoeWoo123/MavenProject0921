package com.flexon.app;

public class StringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////////Test Vowels////////////
		////test Input////
		System.out.println("///////Start test Vowels////////");
		Vowels testVowels = new Vowels("Can you hear me?");
		testVowels.countVowels();
		////User Input////
		Vowels testVowels1 = new Vowels();
		testVowels1.countVowels();
		
		//////////Test Palindrome////////////
		////test Input////
		System.out.println("");
		System.out.println("///////Start test Palindrome///////");
		Palindrome testPalindrome = new Palindrome("Was it a car or a cat I saw?");
		testPalindrome.ReverseAndCheckPalindrom();
		////User Input////
		Palindrome testPalindrome1 = new Palindrome();
		testPalindrome1.ReverseAndCheckPalindrom();
		
		//////////Test Words////////////
		////test Input////
		System.out.println("");
		System.out.println("///////Start test Words////////");
		Words testWords = new Words("I'm fine thank you!");
		testWords.countWords();
		////User Input////
		Words testWords1 = new Words();
		testWords1.countWords();
		
		//////////Test Consonants////////////
		////test Input////
		System.out.println("");
		System.out.println("///////Start test Consonants////////");
		Consonants testConsonants = new Consonants("Are you ok?");
		testConsonants.countConsonants();
		////User Input////
		Consonants testConsonants1 = new Consonants();
		testConsonants1.countConsonants();
		
		//////////Test LastLetterCount////////////
		////test Input////
		System.out.println("");
		System.out.println("///////Start test LastLetterCount////////");
		LastLetterCount testLastLetterCount = new LastLetterCount("This is why.");
		testLastLetterCount.countAndSwitch();
		////User Input////
		LastLetterCount testLastLetterCount1 = new LastLetterCount();
		testLastLetterCount1.countAndSwitch();
	}

}
