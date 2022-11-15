package com.neotech.lesson20;

public class Homework1 {
	
	/*
	 * Create a method that will accept a String as a parameter and return a new
	 * String that consists of only of vowels. Methods should be availabkle inside a
	 * class where it was declared and executed by calling it is name
	 */
	
	//getVowels(String str)
	//input: String str
	//output: String result
	//access within class only: private
	//access directly by name: static
	
	private static String getVowels(String str)
	{
		//here we have to implement the functionality
		
		//regex:
		//[a-f] - range
		//[adfj] - only these letters
		String result = str.replaceAll("[^aeiouAEIOU]",  "");
		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getVowels("Good Evening"));
		
	}

}
