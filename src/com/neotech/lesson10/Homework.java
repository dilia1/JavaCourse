package com.neotech.lesson10;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args) {
		
		
		  //1. Print numbers from 1 to 50 except those that are divisible by 3 
			for (int i = 1; i <= 50; i++) 
			{ 
				if (i % 3 == 0) 
				{ 
					continue; 
				} 
				System.out.print(i + " "); 
				}
		 
		
		System.out.println();
		
		/*
		 * 2. Create a program that will be asking user to apply for a credit card 10
		 * times. As soon you get an "yes" from a user program should stop asking.
		 */
		Scanner scan = new Scanner(System.in);
		String answer;
		//using a for loop because there is a number of iterations
		for (int d = 1; d <= 10; d++)
		{
			System.out.println("Are you applying for a credit card?");
			answer = scan.next();
			if (answer.equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		System.out.println("Please enter following information:");
		
		
		
		
	}

}
