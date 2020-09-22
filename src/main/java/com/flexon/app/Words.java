package com.flexon.app;

import java.util.Scanner;

public class Words {
	private int numOfWords;
	private String userInput;
	
	public Words() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		String userInput = myObj.nextLine();
		this.userInput = userInput;
	}
	
	public Words(String input) {
		this.userInput = input;
	}
	
	public void setUserInput(String newInput) {
		this.userInput = newInput;
	}
	
	public int countWords() {
		String target = this.userInput.trim();
		String[] temp = target.split("[^-A-Za-z]+");
		int count = 0;
		for(String s:temp) {
			if(s != null && s.length() > 0) {
				count += 1;
			}
		}
		this.numOfWords = count;
		System.out.println("Sentence \"" + this.userInput + "\" has " + this.numOfWords + " words.");
		return this.numOfWords;
	}
}
