package com.flexon.app;

import java.util.Scanner;

public class Consonants {
	private int numOfConsonants;
	private String userInput;
	
	public Consonants() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		String userInput = myObj.nextLine();
		this.userInput = userInput;
	}
	
	public Consonants(String input) {
		this.userInput = input;
	}
	
	public void setUserInput(String newInput) {
		this.userInput = newInput;
	}
	
	public int countConsonants() {
		int count = 0;
		char[] inputArray = this.userInput.toCharArray();
		for(int i = 0; i < inputArray.length; i++) {
			char ch = inputArray[i];
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				continue;
			}else if(ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z') {
				continue;
			}else {
				count += 1;
				inputArray[i] = '*';
			}
		}
		this.numOfConsonants = count;
		System.out.println("Sentence \"" + this.userInput + "\" has " + this.numOfConsonants + " consonants.");
		System.out.println("Sentence after process: " + String.valueOf(inputArray));
		return this.numOfConsonants;
	}
}
