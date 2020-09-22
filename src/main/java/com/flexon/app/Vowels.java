package com.flexon.app;
import java.util.Scanner;

public class Vowels {
	private int numOfVowels;
	private String userInput;
	
	public Vowels() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		String userInput = myObj.nextLine();
		this.userInput = userInput;
	}
	
	public Vowels(String input) {
		this.userInput = input;
	}
	
	public void setUserInput(String newInput) {
		this.userInput = newInput;
	}
	
	public int countVowels() {
		int count = 0;
		for(int i = 0; i < this.userInput.length(); i++) {
			char ch = this.userInput.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count += 1;
			}
		}
		this.numOfVowels = count;
		System.out.println("Sentence \"" + this.userInput + "\" has " + this.numOfVowels + " vowels.");
		return count;
	}
}
