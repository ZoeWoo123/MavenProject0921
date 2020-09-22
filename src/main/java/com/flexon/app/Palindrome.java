package com.flexon.app;

import java.util.Scanner;

public class Palindrome {
	private String userInput;
	private boolean isPalindrom;
	public Palindrome() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		String userInput = myObj.nextLine();
		this.userInput = userInput;
		this.isPalindrom = true;
	}
	
	public Palindrome(String input) {
		this.userInput = input;
		this.isPalindrom = true;
	}
	
	public void setUserInput(String newInput) {
		this.userInput = newInput;
	}
	
	public boolean isPalindrome(String str) {
		char[] inputArray = str.toCharArray();
		int l = 0;
		int r = inputArray.length - 1;
		while(l < r) {
			while(inputArray[l] < 'a' || inputArray[l] > 'z') {
				l++;
			}
			while(inputArray[r] < 'a' || inputArray[r] > 'z') {
				r--;
			}
			if(l < r) {
				if(inputArray[l] != inputArray[r]) {
					this.isPalindrom = false;
					return this.isPalindrom;
				}
			}
			l++;
			r--;
		}
		return this.isPalindrom;
	}
	
	public boolean ReverseAndCheckPalindrom() {
		String target = this.userInput.trim().toLowerCase();
		String reversed = new StringBuilder(target).reverse().toString();
		if(reversed.length() == 0) {
			return true;
		}
		if(this.userInput.charAt(0) >= 'A' && this.userInput.charAt(0) <= 'Z')
			reversed = reversed.substring(0,1).toUpperCase() + reversed.substring(1);
		
		System.out.println("Origin: " + this.userInput);
		System.out.println("Reversed: " + reversed);
		if(isPalindrome(target))
			System.out.println("It is palindrome.");
		else
			System.out.println("It is not palindrome.");
		return this.isPalindrom;
	}
}
