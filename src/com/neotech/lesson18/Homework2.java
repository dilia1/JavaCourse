package com.neotech.lesson18;

public class Homework2 {

	public static void main(String[] args) {
		// Write a program to print out the following conversion:
		// Today is Tuesday and we have a Java Class!!! to
		// yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
		
		String str = "Today is Tuesday and we have a Java Class!!!";
		
		// I will do this in two steps
		// 1. Split the long string into words
		// 2. Reverse every word
		
		// 1st way
		String[] strArray = str.split(" ");
		Homework2 hw2 = new Homework2();
		for (String word : strArray)
		{
			String reversedWord = hw2.reverseString(word);
			System.out.print(reversedWord + " ");
			
			// 2nd way
			StringBuffer sb = new StringBuffer(word);
			System.out.println(sb.reverse() + " ");
		}

	}
	
	    
		String reverseString(String input)
		{
			String reversed = "";
			char[] letters = input.toCharArray();
			for (int i = input.length() - 1; i >= 0; i--)
			{
				reversed += letters[i];
			}
			
			return reversed;
		}
	

}
