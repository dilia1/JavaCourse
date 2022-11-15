package com.neotech.lesson16;

public class Task {

	public static void main(String[] args) {
		// Create a string and print it in reverse order
		// Sunday -> yadnuS    //hint: combine for loop with charAt()
		
		
		String sun = "Sunday";
		
		String reverse = "";
		
		//first loop: get y and add it to reverse                y
		//second loop: get an a and add it to the reverse        ya
		//                                                       yad
		for (int i = sun.length()-1; i >= 0; i--) //for (int i = 0; i < sun.length; i++)
		{
			reverse+=sun.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
