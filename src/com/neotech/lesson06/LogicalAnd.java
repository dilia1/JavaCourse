package com.neotech.lesson06;

public class LogicalAnd {
	
	public static void main(String[] args) {
		// Declare a number
		// if number is between 1-10 --> number is small
	    // if number is between 11-100 --> number is medium
		// if number is between 101-1000 --> number is large
		
		// declare a number
		int number =78;
		
		// check if the number is between 1 and 10
		if (number >= 1 && number <= 10) {
			System.out.println("It is a small number");
		}
		//check if the number is between 11 and 100
		else if (number >= 11 && number <= 100) {
		System.out.println("It is a medum number");
		}
		//check if the number is between 101 and 1000
		else if (number >= 101 && number <= 1000) {
			System.out.println("It is a large number");
		}
		//the number is out of range
		else {
			System.out.println(number + " is out of range");
		}
	}

}
