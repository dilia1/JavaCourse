package com.neotech.lesson06;

public class Homework3 {
	
	public static void main(String[] args) {
		// Write a Java Program to check whether number is Even or Odd.
		
		// set your number
		int number = 2373;
		
		// first method
		int remainder = number % 2;
		
		// check is the remainder is 0
		if (remainder == 0) {
			// the number is even
			System.out.println("This number is an even number!");
		}
		else {
			// the number is odd
			System.out.println("This number is an odd number!");
		}
		
		
		// second method
		if (remainder == 1) {
			// the number is odd
			System.out.println("This mumber is an odd number!");
		}
		else {
			// the number is even
			System.out.println("This number is an even number!");
		}
		
		
		// third method
		if (number % 2 == 1) {
			System.out.println("This number is an odd number!");
		}
		else {
			System.out.println("This number is an even number!");
		}
		
		//fourth method
		//boolean method
		boolean isEven = number % 2 == 0;
		//
		if (isEven) {
			System.out.println("This number is an even number!");
		}
		else {
			System.out.println("This number is an odd number!");
		}
	}

}
