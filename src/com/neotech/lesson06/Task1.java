package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		// 1. Write a program that asks user to enter first name and then last name.
		// At the end system should display user's full name.
		
		Scanner input=new Scanner(System.in);
		
		// Ask user for first name
		System.out.println("Waht is your first name?");
		String firstName = input.next();
		
		// Ask user for last name
		System.out.println("What is your last name?");
		String lastName = input.next();
		
		// Print full name on the screen
		System.out.println("Full name: " + firstName + " " + lastName);
		
	}

}
