package com.flexon.app;

import java.util.Scanner;

public class LastLetterCount {
	private int numOfS;
	private int numOfY;
	private String userInput;
	
	public LastLetterCount() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please input a sentence:");
		String userInput = myObj.nextLine();
		this.userInput = userInput;
	}
	
	public LastLetterCount(String input) {
		this.userInput = input;
	}
	
	public String countAndSwitch() {
		if(this.userInput.length() == 0) {
			System.out.println("Nothing Input.");
			return "";
		}
		String target = this.userInput.trim();
		boolean firstLetterUpperCase = false;
		if(target.charAt(0) >= 'A' && target.charAt(0) <= 'Z')
			firstLetterUpperCase = true;
		
		String[] temp = target.split("\\s+|\\.");
		int firstSPos = -1;
		int firstYPos = -1;
		
		for(int i = 0; i < temp.length; i++) {
			String s = temp[i];
			if(s != null && s.length() > 0) {
				int len = s.length();
				if(s.charAt(len-1) == 's') {
					this.numOfS += 1;
					if(firstSPos < 0){
						firstSPos = i;
					}
				}else if(s.charAt(len-1) == 'y') {
					this.numOfY += 1;
					if(firstYPos < 0) {
						firstYPos = i;
					}
				}
			}
		}
		if(firstSPos >= 0 && firstYPos >= 0) {
			String s = temp[firstSPos];
			temp[firstSPos] = temp[firstYPos];
			temp[firstYPos] = s;
			
			int checkIfFirst = firstSPos<firstYPos?firstSPos:firstYPos;
			if(checkIfFirst == 0) {
				temp[checkIfFirst] = temp[checkIfFirst].substring(0, 1).toUpperCase() + temp[checkIfFirst].substring(1);
				if(temp[checkIfFirst].charAt(temp[checkIfFirst].length()-1) == '.')
					temp[checkIfFirst] = temp[checkIfFirst].substring(0, temp[checkIfFirst].length()-1);
			}
			int checkIfNeedReg = firstSPos>firstYPos?firstSPos:firstYPos;
			if(!temp[checkIfNeedReg].matches("[^-A-Z0-9]")) {
				temp[checkIfNeedReg] = temp[checkIfNeedReg].toLowerCase();
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(String t:temp) {
			result.append(t);
			result.append(" ");
		}
		String resultString = result.toString();
		resultString = resultString.trim();
		resultString += ".";
		System.out.println("Origin: " + this.userInput);
		System.out.println("Has " + this.numOfS + " words end in s.");
		System.out.println("Has " + this.numOfY + " words end in y.");
		System.out.println("Switched: " + resultString);
		return resultString;
	}
}
