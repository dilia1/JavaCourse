package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {
	
	
	public static void main(String[] args) {
	
	//ask the user to enter an integer and build a following pattern:
	//if the user entered 5, there should be 2 parts
	//	the first part 1 to 5, the second part 1 to 4
	
	
	//1
	//1 2
	//1 2 3
	//1 2 3 4
	//1 2 3 
	//1 2
	//1
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = scan.nextInt();
	
	for (int i = 1; i <= num; i++)
	{
		for (int j = 1; j <= i; j++)
		{
		System.out.print(j + " ");
		}
		System.out.println();
	}
	
	//print the bottom pattern
	//1234
	//123
	//12
	//1
	for ( int i = num-1; i >= 1; i--)
	{
		for (int j = 1; j <= i; j++)
		{
			System.out.print(j + " ");
		}
		System.out.println();
		
	}
	
	
	
	}

}
